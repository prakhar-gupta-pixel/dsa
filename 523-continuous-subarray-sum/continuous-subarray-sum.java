class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        int prefix_sum = 0 ;
    
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        boolean result = false;
    


        for ( int i = 0 ; i < nums.length ;i++) {


            prefix_sum+= nums[i];
            int rem = prefix_sum%k ;
            if (rem<0){
                rem =rem+k;
            }

            if (map.containsKey(rem)){

                int length = i-map.get(rem);

                if(length >= 2){
                    result = true;
                    break;
                }


            }
        


            if (!map.containsKey(rem)){
                map.put(rem,i);
            }

        }

            return result;
        
    }
}