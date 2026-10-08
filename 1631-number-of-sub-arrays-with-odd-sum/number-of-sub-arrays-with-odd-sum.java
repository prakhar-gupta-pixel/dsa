class Solution {
    public int numOfSubarrays(int[] arr) {
        
        long ans = 0;
        int prefix_sum =0 ;

        int evenCounter = 1;
        int oddCounter = 0;

        for ( int i  =  0 ; i < arr.length ; i++){

            prefix_sum += arr[i];

            if ( (prefix_sum%2)!=0 ){

                ans+=evenCounter;
                oddCounter++;
            }

            else {
                ans+=oddCounter;
                evenCounter++;
            }

            

        }

        return (int) (ans%1_000_000_007);
    }
}