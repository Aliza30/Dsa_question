class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s,e;
        s=0;
        double avg=Integer.MIN_VALUE;
        double temp=0;
        for(e=0;e<nums.length;e++){
            temp+=nums[e];
            if((e-s+1)==k){
                avg=Math.max(avg,temp);
                temp=temp-nums[s];
                s++;
            }
           // System.out.println(temp);
        }
        return (avg/k);  
    }
}