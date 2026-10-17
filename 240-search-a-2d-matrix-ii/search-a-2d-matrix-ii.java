class Solution {


    

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int a = m-1;
        int b = 0;

        int start = matrix[a][b];
        if(start == target){
            return true;
        }


        while((a>=0)&&(b<n)){

           start = matrix[a][b];


            if(start == target){
            return true;
        }
    

        if (start>target){
            a--;
        }

        else if(start<target){
            b++;

        }

        



        }

        return false;


        
    }
}