class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        StringBuilder str = new StringBuilder();
        int k=2*(numRows-1);
        for(int r=0; r<numRows; r++){
            int index= r;
            while(index<s.length()){
                str.append(s.charAt(index));
                if(r!=0 && r!=numRows-1){
                    int k1=k-(2*r);
                    int k2=index+k1;
                if(k2<s.length()){
                    str.append(s.charAt(k2));
                }
                }
                index=index+k;
            }
        }
 return str.toString() ;
    }
}