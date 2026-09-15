class Solution {
    public int countCommas(int n) {
        int a = 1000;
        int b = 0;
        while ( n >= a ) {
            b = n-a+1;
            a = a*1000;
        }return b;
    }
}