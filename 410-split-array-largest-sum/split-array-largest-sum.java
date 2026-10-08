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

            int std = 1; 
            int st_pages = 0;

            for ( int i = 0 ; i < nums.length ; i++){

                if ((st_pages+ nums[i])<= pages){
                    st_pages += nums[i];
                }


                else { 
                    std++;
                    st_pages = nums[i];
                }
            }

            return std;
        }

    public int splitArray(int[] nums, int k) {
        
        int low= max(nums);

        int high = sum(nums);
        int ans = high;

        if (nums.length < k){
            return -1;
        }

        while ( low <= high){

            int mid = low + (high-low)/2;
            int std = check(nums,mid);

            if ( std <=k ){
                ans = mid;
                high = mid-1;
            }

            else {
                low = mid +1;
            }
        }


        return ans;

        

        
    }
}