public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count=0;
        while(n!=0){
            n=(n&(n-1));
            count++;
        }
        return count;
    }
}

/*  time compl. = O(number of bits); too long !!!
 int count=0;
        while(n!=0){
            count += n %2;
            n= n >> 1;
        }
        return count;
        */