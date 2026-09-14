class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int left = 0; left<nums.length ; left++){
            if(nums[left] != val){
                nums[k] = nums[left];
                k++ ;
            }
        }  return k;
    }
}