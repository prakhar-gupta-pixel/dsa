    class Solution {
        public int max (int [] nums ){
            int max  =Integer.MIN_VALUE;


            for (int i = 0; i< nums.length ; i++){

                    max = Math.max(nums[i],max);
            }
            return max;
        }

        public long hours ( int [] nums , int k ){

            long total_hours = 0;

            for (int i  = 0 ; i< nums.length ; i++){

                if ((nums[i]%k)==0){

                    total_hours += nums[i]/k;
                }

                else if ((nums[i]%k)!=0){
                    total_hours += (nums[i]/k) + 1;

                }

            }

            return total_hours;
        }

        public int minEatingSpeed(int[] piles, int h) {


            int low = 1;
             if (piles.length == 0){

                return 0;
            }
            int high = max(piles);

           

            int ans = high    ;

            while ( low <= high){
            

                int mid = low + ( high -low )/2;
                long total_hours = hours( piles, mid);


            
                if ( total_hours > h){
                
                    low = mid + 1;


                }

                else if ( total_hours <=h){
                    ans = mid;
                    high = mid -1 ;
                }


            }


            return ans ;
            
        }
    }