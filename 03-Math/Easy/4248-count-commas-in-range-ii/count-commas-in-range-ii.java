class Solution {
    public long countCommas(long n) {
        long a = 1000;
        long b = 0; 
        while(n >= a){
            b = b + (n-a+1) ;
            a = a*1000;
        } return b;
    }
}