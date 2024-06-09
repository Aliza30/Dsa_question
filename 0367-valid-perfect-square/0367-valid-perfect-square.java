class Solution {
    public boolean isPerfectSquare(int num) {
         long high = (long)num;
    long low = 0;
    while(low<=high){
        long mid = (high+low)/(long)2;
        long sq = mid*mid;
        if(sq==(long)num)
            return true;
        else if(sq > num)
            high = mid-1;
        else 
            low = mid+1;
    }
    return false;
    }
}