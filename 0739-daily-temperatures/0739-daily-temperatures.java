class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helper= new Stack<>();
        int n=temperatures.length;
        int[] result= new int[n];
        for(int i=n-1; i>=0;i--){
            while(!helper.isEmpty() && temperatures[i]>=temperatures[helper.peek()]){
                helper.pop();
            }
            if(!helper.isEmpty() ){
                result[i]=helper.peek()-i;
            }
            helper.push(i);
        }
        return result;
        
        }
}