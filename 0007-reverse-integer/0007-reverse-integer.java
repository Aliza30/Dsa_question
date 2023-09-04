class Solution {
    public int reverse(int x) {
         int rev_no = 0;
        
        while (x != 0) {
            int digit = x % 10;

            if (rev_no > Integer.MAX_VALUE / 10 || (rev_no == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev_no < Integer.MIN_VALUE / 10 || (rev_no == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev_no = rev_no * 10 + digit;
            x /= 10;
        }
        
        return rev_no;
    }
}