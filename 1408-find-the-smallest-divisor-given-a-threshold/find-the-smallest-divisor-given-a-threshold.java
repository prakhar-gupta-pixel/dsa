class Solution {


       public int max (int [] nums ){
            int max  =Integer.MIN_VALUE;


            for (int i = 0; i< nums.length ; i++){

                    max = Math.max(nums[i],max);
            }
            return max;
        }


    public int check ( int [] nums,int divisor ){

        int count = 0 ;

        for (int i = 0 ; i < nums.length ; i++ ){


              count += Math.ceil((double) nums[i] / divisor);



        }


        return count ;


    }
    public int smallestDivisor(int[] nums, int threshold) {
        



        int low= 1;
        int high = max(nums);
        int ans =  max(nums) ;


        while ( low <= high){


            int mid = low + (high-low )/2;

            if (check(nums,mid)<=threshold){

                ans = mid;
                high = mid -1;

            }



            else {
                low = mid +1;
            }
        } 


        return ans ;
    }
}