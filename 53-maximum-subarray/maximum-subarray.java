class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = 0;
        int maxsum = nums[0];
        for (int i = 0;i < nums.length; i++){
           currentsum = Math.max(currentsum + nums[i],nums[i]);
             if( currentsum > maxsum){
                maxsum = currentsum;
            }
        }
        return maxsum;
    } 
}