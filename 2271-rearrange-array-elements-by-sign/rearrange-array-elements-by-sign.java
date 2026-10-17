class Solution {
    public int[] rearrangeArray(int[] nums) {
        

        int n = nums.length;
        int ans[] = new int[n];

        int pos= 0;
        int neg = 1;
        int i = 0 ;

        while(i<n){

            if (nums[i]>0){
                ans[pos]= nums[i];
                pos+=2;
            }

            if ( nums[i]<0){
                ans[neg]= nums[i];
                neg+=2;
            }

            i++;



        }

        return ans;

    }
}