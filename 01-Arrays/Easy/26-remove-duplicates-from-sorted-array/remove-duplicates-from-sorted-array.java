class Solution {
    public int removeDuplicates(int[] nums) {
      int left = 0;
         for(int a = left+1 ; a<nums.length ; a++) {
            if(nums[left] != nums[a]){
                nums[left+1] = nums[a];
                left++; 
            }
         } return left+1;
    }
}