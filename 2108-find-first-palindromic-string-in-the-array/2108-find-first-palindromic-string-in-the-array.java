class Solution {
    public String firstPalindrome(String[] words) {
   
       for(String str: words){
          String rev= reverce(str);
          if(str.equals(rev)){
              return str;
          }
       } 
        return "";
    }
    static String reverce(String str){
        String s="";
        for(int i=str.length()-1; i>=0;i--){
            s = s + str.charAt(i);
        }
        return s;
    }
}