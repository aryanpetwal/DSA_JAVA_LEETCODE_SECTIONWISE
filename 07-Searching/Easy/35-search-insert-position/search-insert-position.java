class Solution {
    public int searchInsert(int[] nums, int target) { 
        int left = 0 ;
        int a = nums.length - 1;
        while (left <= a) {
             int mid = (a + left) / 2;

                 if (nums[mid] < target) {
                    left = mid + 1;
                 }
                 else if (nums[mid] > target) {
                    a = mid - 1;
                 }
                else {
                   return mid;
                 }
        }
        return left;
    }
}