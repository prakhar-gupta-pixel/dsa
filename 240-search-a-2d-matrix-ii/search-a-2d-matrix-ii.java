class Solution {


    public  boolean binary( int [] arr, int target ){

        int low = 0;
        int high = arr.length-1;
        boolean found = false;


        while ( low<= high ){

            int mid = low + (high-low)/2;

            if ( arr[mid]== target){
                found =true;

                return found;
            }
            
            else if ( arr[mid]>target){
                high = mid-1;
            }

            else {
                low = mid +1;
            }
        }
        return found;
    }


    public boolean searchMatrix(int[][] matrix, int target) {

        boolean found  = false;
        int n = matrix[0].length;


        for ( int i =0 ; i< matrix.length;i++){

            if (matrix[i][0]<= target && target<=matrix[i][n-1]){
               boolean result =  binary(matrix[i],target);

               if(result!=false){
                return result;
               }
            }


        } 

        return false;
    }
}