

     

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            
            int minVal = Integer.MAX_VALUE;
            int colIndex = -1;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

         
            boolean isMax = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > minVal) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                result.add(minVal);
            }
        }

        return result;
        
    }
}