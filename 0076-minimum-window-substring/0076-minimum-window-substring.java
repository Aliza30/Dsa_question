class Solution {
    public String minWindow(String s, String t) {
        String resultStr="";
        if(t.length()>s.length()){
            return resultStr;
        }
        int[] tCount= new int[128];
        for(char ch:t.toCharArray()){
            tCount[ch]++;
        }
        char[] schar=s.toCharArray();
        int left=0;int right=0;
        int found =0, toFind=t.length();
        int minWindowLength=Integer.MAX_VALUE;
        while (right< s.length()){
            char ch=schar[right];
            tCount[ch]--;
            if(tCount[ch]>=0){
                found++;
            }
            while(found== toFind){
                if(minWindowLength>(right-left+1)){
                    minWindowLength = right-left+1;
                    resultStr= s.substring(left,right+1);
                    
                }
                tCount[schar[left]]++;
                if(tCount[schar[left]]>0)
                    found--;
                left++;
            }
            right++;
        }
        return resultStr;
    }

}