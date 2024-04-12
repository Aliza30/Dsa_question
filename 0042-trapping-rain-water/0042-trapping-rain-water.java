class Solution {
    public int trap(int[] height) {
      int water=0;
        int [] leftM= new int [height.length];
        leftM[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftM[i]=Math.max(height[i],leftM[i-1]);
        }
        int [] rightM= new int [height.length];
        rightM[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightM[i]=Math.max(height[i],rightM[i+1]);
        }
        for(int i=0;i<height.length;i++){
            water=water+(Math.min(rightM[i],leftM[i])-height[i]);
        }
        return water;  
    }
}