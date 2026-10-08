class Solution {

    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        
        int prefix_sum = 0 ;
        int count = 0;
       
        map.put(0,1);
    


        for ( int x :nums){
            prefix_sum+= x;
            int rem = prefix_sum%k ;
            if (rem<0){
                rem =rem+k;
            }

            

            if (map.containsKey(rem)){
                count+= map.get(rem);
            }

            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        return count ;
    }
}