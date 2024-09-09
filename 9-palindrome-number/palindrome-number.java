class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num =0 ;
        int original = x;
        while(x!= 0){
            int digit = x % 10 ;
            num = num * 10 + digit;
            x /= 10 ;
        }
        return num == original;
    }
}