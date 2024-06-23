class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if(n==0) return true;
        int plant=0;
        int len=flowerbed.length;
        for(int i=0;i<len;i++){
            if(flowerbed[i]==0){
                boolean prev= i==0|| flowerbed[i-1]==0;
                boolean next = i == len-1|| flowerbed[i+1]==0;
                if(prev && next){
                    flowerbed[i]=1;
                    plant++;
                }
            }
        }
        return plant>=n;
    }
}