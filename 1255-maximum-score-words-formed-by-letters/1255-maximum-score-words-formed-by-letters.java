class Solution {
     int n;
    int maxi=0;
    private void solve(String[] words,int[] score,int indx,int currscore,int[] freq){
        if(indx==n){
            maxi=Math.max(maxi,currscore);
            return;
        }
        int tempFreq[]=Arrays.copyOf(freq,freq.length);
        int tempScore=0;
        int j=0;
        while(j<words[indx].length()){
            char ch=words[indx].charAt(j);
            tempFreq[ch-'a']--;
            tempScore+=score[ch-'a'];
            if(tempFreq[ch-'a']<0){
                break;
            }
            j++;
        }
        if(j==words[indx].length())
        solve(words,score,indx+1,currscore+tempScore,tempFreq);
        
        //not-take
        solve(words,score,indx+1,currscore,freq);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
       n=words.length;
      int freq[]=new int[26];
       for(char ch:letters){
        freq[ch-'a']++;
       } 
       solve(words,score,0,0,freq);
       return maxi;
    }
}