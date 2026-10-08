class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> rowmin=new ArrayList<>();
        ArrayList<Integer> colmax=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(top<=bottom){
            for(int i=left;i<=right;i++){
                min=Math.min(min,matrix[top][i]);

            }
            rowmin.add(min);
            min=Integer.MAX_VALUE;
            top++;
            
        }
        
           top=0;
         
         while(left<=right){
            for(int i=top;i<=bottom;i++){
                max=Math.max(max,matrix[i][left]);

            }
            colmax.add(max);
            max=Integer.MIN_VALUE;
            left++;
            
        }
       
        rowmin.retainAll(colmax);
        
        return rowmin;
        


        


        
    }
}