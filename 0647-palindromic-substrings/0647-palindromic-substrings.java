class Solution {
    int result=0;
    public int countSubstrings(String s) {
        
        for(int i=0;i<s.length();i++){
            count(s,i,i);
            count(s,i,i+1);
        }
        return result;
    }
    
    public void count(String s, int str, int end){
        while(str>=0&& end<s.length()&&s.charAt(str)==s.charAt(end))
        {
            result++;
            str--;
            end++;
        }
    }
}
/* int result=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            count(s,i,i);
            count(s,i,i+1);
        }
        return result;
    }
    
    public void count(String s, int str, int end){
        while(str>=0&& end<s.length()&&s.charAt(str)==s.charAt(end))
        {
            result++;
            str--;
            end++;
        }
    }*/