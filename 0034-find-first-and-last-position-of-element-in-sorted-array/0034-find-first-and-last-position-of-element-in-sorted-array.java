class Solution {

      public int lowerbound(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length -1;
        int ans = nums.length;
        

        while (low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>=target){
                ans = mid ;
                high = mid-1;

            }



            else{
            low = mid+1;
            }
        }

        return ans;

 
    }

    public int upperbound(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length -1;
        int ans = nums.length;
        

        while (low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>target){
                ans = mid ;
                high = mid-1;

            }



            else{
            low = mid+1;
            }
        }

        return ans;

 
    }
    public int[] searchRange(int[] nums, int target) {

        int lb = lowerbound(nums,target);
        

            if((lb == nums.length)||(nums[lb]!=target) ){
                
                return new int[]{-1,-1};
            }

         return new int[]{lowerbound(nums,target),upperbound(nums,target)-1};
    }
}