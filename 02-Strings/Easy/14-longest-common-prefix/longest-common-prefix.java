class Solution {

    public String longestCommonPrefix(String[] strs) {

        int min = strs[0].length();

        // Find length of shortest string
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        // Compare characters
        for (int j = 0; j < min; j++) {

            for (int i = 1; i < strs.length; i++) {

                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }

        return strs[0].substring(0, min);
    }
}