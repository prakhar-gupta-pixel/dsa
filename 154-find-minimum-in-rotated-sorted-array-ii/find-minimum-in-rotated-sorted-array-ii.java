class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high){
            int mid= low+(high -low)/2;
            min = Math.min(min,nums[mid]);


         
            // if(low==high){
            //     return min;
            // }

            if (nums[mid]<nums[high]){
                high=mid-1;
            }


            else if (nums[mid]>nums[high]){
                low =  mid+1;

            }
            else if (nums[mid]==nums[high]){
                high--;
            }



        }

        return min;
        
    }
}