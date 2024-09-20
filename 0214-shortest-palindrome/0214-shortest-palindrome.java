class Solution {
    public String shortestPalindrome(String s) {
          StringBuilder res = new StringBuilder();
        int j=0, end = s.length();
        while(true){
            j=0;
            for(int i=end-1;i>=0;i--){
                if(s.charAt(i) == s.charAt(j)) j++;
            }
            if(j==end) break;
            end = j;
        }
        res.append(s.substring(end, s.length())).reverse().append(s.substring(0, end)).append(s.substring(end, s.length()));
        return res.toString();
    }
}