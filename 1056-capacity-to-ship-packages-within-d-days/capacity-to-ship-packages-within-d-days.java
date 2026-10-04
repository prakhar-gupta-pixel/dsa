class Solution {

     public int maximumElement (int [] nums ){
            int max  =Integer.MIN_VALUE;


            for (int i = 0; i< nums.length ; i++){

                    max = Math.max(nums[i],max);
            }
            return max;
        }


    public int max( int [] weights ){

        int max = 0;

        for ( int i = 0  ; i < weights.length ;i++ ){

                max+= weights[i];

        }

        return max;
    }


    public int days( int [] weights , int mid){

        int total_days = 0 ;
        int count = 0 ;


        for ( int i  = 0 ; i < weights.length ;i ++)
        {

            

            if ( (count+weights[i])<= mid ){
                count += weights[i];
            }
          

            else {

                total_days+= 1;

                count = weights[i] ;
            }
        }
        total_days+=1;


        return total_days;

    }
    public int shipWithinDays(int[] weights, int days) {


        
        int low= maximumElement(weights);
        int high =  max ( weights);

        int ans  = high ;


        while ( low <= high ){


            int mid = low + (high -low)/2;

            if ((days(weights, mid))<= days){
                ans = mid ;
                high = mid -1 ;

            }

            else {
                low = mid + 1;

            }




        }




        return ans ;


    }
}