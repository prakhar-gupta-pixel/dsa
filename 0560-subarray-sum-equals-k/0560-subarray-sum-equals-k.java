class Solution {
    public int subarraySum(int[] nums, int k) {

         HashMap<Integer, Integer> map = new HashMap<>();

         int prefixsum =0 ;
         int count = 0 ;

         map.put(0,1);

         for ( int x : nums){

             prefixsum += x;
             
             int needed = prefixsum -k ;
             
             if (map.containsKey(needed)){
                 count+= map.get(needed);
                 
             }
             
             map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
         }

    
         return count;
        
    }
}