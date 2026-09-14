class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set = new HashSet<>();
          HashSet<Integer> result = new HashSet<>();
        for(int i = 0 ; i< nums2.length ; i++) {
            set.add(nums2[i]); 
        }
            for (int i = 0 ;i<nums1.length; i++){
                 if (set.contains(nums1[i])){
                     result.add(nums1[i]);
                 }
            }
        int[] answer = new int[result.size()];
        int k = 0;
        for (int num : result) {
             answer[k] = num;
             k++;
        }
        return answer;
    }
}