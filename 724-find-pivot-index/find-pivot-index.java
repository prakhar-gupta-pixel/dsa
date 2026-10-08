class Solution {
   public int max( int [] weights ){

        int max = 0;

        for ( int i = 0  ; i < weights.length ;i++ ){

                max+= weights[i];

        }

        return max;
    }

    public int pivotIndex(int[] nums) {

        int left  = 0;
      
        int sum  = max(nums);
          int righty = sum - left -nums[0];

        if (left == righty){
            return 0;
        }



        for (int i = 1 ; i <nums.length ; i++){

            left+=nums[i-1];
            int right = sum - left-nums[i];

            if (left==right){
                return i;
            }
        }

        return -1;

        
        
    }
}