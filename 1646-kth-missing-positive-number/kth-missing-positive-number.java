class Solution {
    public int findKthPositive(int[] arr, int k) {
        
      int num = 1;

      int i =0;

      while ( k>0){


        if ( (i < arr.length)&&(arr[i]== num) ){

            num++;
            i++;

          

        }

        else {

            num++;
            k--;

            if ( k==0 ){

                return num-1;
            }
        }


      }

      return 0 ;


    
     }

        
    }




