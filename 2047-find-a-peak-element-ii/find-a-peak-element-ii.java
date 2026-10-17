class Solution {


    public int findmax ( int [][]mat, int column){

         int max = mat[0][column];
         int max_row = 0;
         

      for (int i = 1; i < mat.length; i++) {
        if (mat[i][column] > max) {
            max = mat[i][column];
            max_row = i;
        }
    }

    return max_row;


    }
    public int[] findPeakGrid(int[][] mat) {
        
        int low  = 0 ;
        int high = mat[0].length-1;


        while(low<=high){
            int mid = low+(high-low)/2;

            int max_row= findmax(mat, mid);
             
            int left = (mid == 0) 
           ? -1 
           : mat[max_row][mid - 1];

            int right = (mid == mat[0].length - 1) 
            ? -1
            : mat[max_row][mid + 1];

            int check = mat[max_row][mid];

            if((check > left)&& (check>right)){
                return new int []{max_row,mid};

            }


            else if (check<left){
                high = mid-1;
            }

            else {

                low = mid+1;
            }






        }
        

        return new int []{-1,-1};
    }
}