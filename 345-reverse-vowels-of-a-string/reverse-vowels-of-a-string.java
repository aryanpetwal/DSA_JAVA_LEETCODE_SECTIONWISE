class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        char[] arr = s.toCharArray();
        int right = s.length() - 1;
        while (left < right){
            if (!"aeiouAEIOU".contains(String.valueOf(s.charAt(left)))){
                    left++;
            }
            else if (!"aeiouAEIOU".contains(String.valueOf(s.charAt(right)))){
                    right--;
            }
            else { char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            }
        }return new String(arr);
    }
}