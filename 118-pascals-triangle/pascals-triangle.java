class Solution {
    public List<List<Integer>> generate(int numRows) {
        

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            long value = 1;
            row.add(1);

            for (int j = 1; j <= i; j++) {
                value = value * (i - j + 1) / j;
                row.add((int) value);
            }

            ans.add(row);
        }

        return ans;
    }
}