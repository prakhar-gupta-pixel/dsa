class Solution {

    public int max (int [] nums ){
        
        int max = Integer.MIN_VALUE;

        for ( int i =0 ; i< nums.length ;i++){

            max = Math.max(nums[i],max);

        }

        return max;
    }
    public int missingNumber(int[] nums) {

        int max = max(nums);
       int [] hash = new int[max+1];

       for ( int  i=0 ; i< nums.length;i++){
            hash[nums[i]]++;
       } 


    for ( int  i=0 ; i<hash.length;i++){

            if (hash[i]==0){
                return i ;
            }
       } 


       return max+1;
    }
}