class Solution {
    public List<String> letterCombinations(String digits) {
       if(digits.length() == 0){
             ArrayList<String> str = new ArrayList<>();
             return str;
         }
        return padArrSol("", digits);
    }
      static ArrayList<String> padArrSol(String p , String up){
        
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        int i = (digit-2)*3;
        if(digit> 7){
            i += 1;
        }
        int length = i+3;
        if(digit == 7 || digit == 9){
            length +=1;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (; i < length; i++) {
            char ch = (char)('a' + i);

            ans.addAll(padArrSol(p+ch,up.substring(1)));

        }
        return ans;
    }
}