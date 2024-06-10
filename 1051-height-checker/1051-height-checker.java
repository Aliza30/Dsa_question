class Solution {
    public int heightChecker(int[] heights) {
int[] duplicate = Arrays.copyOf(heights, heights.length);
        int op=0;
        Arrays.sort(duplicate);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=duplicate[i]){
            op+=1;
            }
        }
        return op;
    }
}