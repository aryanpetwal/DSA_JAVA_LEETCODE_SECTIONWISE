class Solution {
    public int[] plusOne(int[] digits) {
        int left = 0; 
        int right = digits.length - 1;
            while(right >= 0 && digits[right] == 9) {
                 digits[right] = 0;
                 right--;
            }
            if (right == -1) {
                 int[] a = new int [digits.length + 1];
                 left = 1;
                 a[0] = left;
                 return a;
            }
            digits[right]++;
            
            return digits;
    }
}