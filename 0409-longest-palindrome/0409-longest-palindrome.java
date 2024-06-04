class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character, Integer> frequencyMap= new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);        
        }

        int ans=0;
        Boolean isOdd=false;
        for(Map.Entry<Character,Integer> entry:frequencyMap.entrySet() ){
            if(entry.getValue()%2==0){
                ans+=entry.getValue();
            }
            else{
                isOdd= true;
                ans+=entry.getValue()-1;
            }
        }
            return (isOdd)? ans+1: ans;
        
    }
}