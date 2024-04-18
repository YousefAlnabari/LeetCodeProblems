class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long reversed = 0;
        while(x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        if(reversed > Integer.MAX_VALUE)
            return 0;
        return isNegative ? -(int) reversed : (int) reversed;
    }
}
