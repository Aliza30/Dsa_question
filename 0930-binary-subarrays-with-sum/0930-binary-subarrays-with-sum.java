class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map= new HashMap<>();
        int count=0;
        int sum=0;
        for(int num: nums){
            sum +=num;
            if(sum==goal){
                count++;
            }
            if(map.containsKey(sum-goal)){
                count+= map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}