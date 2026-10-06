class Solution {
    public double myPow(double x, int n) {

        double ans =1;
        long N = Math.abs((long) n);



        

            
             while (N>0){

            if (N%2==1){

                ans = ans*x;
                N=N-1;
            }

            else {
                N=N/2;
                x= x*x;
            }
        }

            return n<0 ? 1/ans: ans;
        }

        

       

     
        
    }
