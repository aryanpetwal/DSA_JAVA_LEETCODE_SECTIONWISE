class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            int h;
            if (height[i] < height[j]) {
                 h = height[i];
            } else {
                h = height[j];
            }
            int area = (j-i) * h;
            if(area > maxarea){
                maxarea = area;
            }
             if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }return maxarea;
    }
}