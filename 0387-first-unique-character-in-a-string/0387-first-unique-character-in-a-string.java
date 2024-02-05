class Solution {
    public int firstUniqChar(String s) {
        int[] freq= new int[26];
char[] cha = s.toCharArray();

        for(char ch:cha){
            freq[ch-'a']++;
        }
        
        for(int i=0;i<cha.length;i++){
            if(freq[cha[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
   
}