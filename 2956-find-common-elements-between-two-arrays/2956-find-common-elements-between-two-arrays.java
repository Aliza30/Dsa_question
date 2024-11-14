class Solution {
    public int[] findIntersectionValues(int[] num1, int[] num2) {
        int ans1=0;
        int ans2=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    ans1++;
                    break;
                }
            }
        }
        for(int i=0;i<num2.length;i++){
            for(int j=0;j<num1.length;j++){
                if(num2[i]==num1[j]){
                    ans2++;
                    break;
                }
            }
        }
        return new int[] {ans1, ans2};
    }
}