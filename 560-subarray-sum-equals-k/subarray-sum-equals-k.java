class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        int prefix_sum = 0 ;
        int count = 0;
        map.put(0,1);

        for ( int x :nums){
            prefix_sum+= x;

            int needed = prefix_sum -k;

            if (map.containsKey(needed)){
                count+= map.get(needed);
            }

            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }

        return count ;
    }
}