class Solution {
    public int findMaxLength(int[] nums) {
        int max_len = 0;
              int prefix_sum = 0;
                    HashMap<Integer, Integer> map = new HashMap<>();

              map.put(0,-1);


              for (int i = 0 ; i< nums.length ;i++){
              
                if ( nums[i]==0){
                    prefix_sum+=-1;
                }

                else if (nums[i]==1){
                    prefix_sum+=1;
                }

                int needed = prefix_sum-0;

                if (map.containsKey(needed)){

                    max_len = Math.max(max_len,i-map.get(needed));
                }

                if(!map.containsKey(needed)){
                    map.put(prefix_sum,i);
                }



              
              
              }
                
                return max_len;
    }
}