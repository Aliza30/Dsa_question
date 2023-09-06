class Solution {
    public int[] plusOne(int[] digits) {
           int n = digits.length;
        for(int i=  n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;//when ever arr[n]=9 it will be set 0 and i--;
        }
        digits = new int[n+1];//arr[9]; increase size of arr length
        digits[0] = 1;//arr[0] th place= 1 as per 3rd example;
        return digits;   // return value
             

    }
}