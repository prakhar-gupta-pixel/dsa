class Solution {

         public int max (int [] nums ){
            int max  =Integer.MIN_VALUE;


            for (int i = 0; i< nums.length ; i++){

                    max = Math.max(nums[i],max);
            }
            return max;
        }

         public int sum( int [] weights ){

        int max = 0;

        for ( int i = 0  ; i < weights.length ;i++ ){

                max+= weights[i];

        }

        return max;
    }


        public int check( int [] nums , int pages){

            int st_pages = 0;
            int counter = 0 ;
            for (int i = 0 ; i< nums.length ; i++){

                if((nums[i]+st_pages)<=pages){

                    st_pages += nums[i];
                }

                else {
                    counter++;
                    st_pages = nums[i] ;

                }

            }
            counter++;
            return counter;
    }



       public int splitArray(int[] nums, int k){

            int low = max(nums);
            int high = sum(nums);


            int ans = -1 ;

            if (nums.length< k){
                return -1;
            }



            while ( low <= high ){


                int mid = low+ (high-low)/2;


                if(check(nums,mid)<=k){
                    ans = mid;
                    high = mid-1;
                }

                else {
                    low = mid+1;
                    
                }
            }

            return ans  ;
       }
 }