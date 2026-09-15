class Solution {
    public int missingNumber(int[] nums) {
        int Range = nums.length ;
        int ExpectedSum = (Range * (Range + 1)) / 2 ;
        int ActualSum = 0;
            for (int i = 0; i < nums.length; i++) {
                ActualSum = ActualSum + nums[i];
            }
     return ExpectedSum - ActualSum;
}
}