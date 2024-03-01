class Solution {
    public String maximumOddBinaryNumber(String s) {
      int countOnes = 0;
        StringBuilder resultBuilder = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                resultBuilder.append('1');
            } else {
                resultBuilder.append('0');
            }
        }
        
        resultBuilder.append('1');
        return resultBuilder.toString();  
    }
}