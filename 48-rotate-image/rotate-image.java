class Solution {

    public void swap ( int [][]matrix,int i, int j){

        int temp = matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int [][] matrix ,int i , int j){

        int n = matrix[0].length;
        int temp = matrix[i][j];
        matrix[i][j]= matrix[i][n-j-1];
        matrix[i][n-j-1] = temp;
    }

    
    public void rotate(int[][] matrix) {


        int m = matrix.length;
        int n = matrix[0].length;
        
        for ( int i = 1; i<m;i++){

            for ( int j=0; j<i;j++){

                
                swap(matrix,i,j);
            }
        }


        for ( int i =0 ; i< m ;i++){

            for ( int j =0 ; j<n/2 ;j++){
            
                reverse(matrix,i,j);
            }
        }
    }
}