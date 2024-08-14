class Solution {
    public int maxOperations(int[] nums, int k) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(k-nums[i])){
                System.out.println(k-nums[i]);
                if (nums[i] == k-nums[i] && map.get(nums[i])<2){
                    System.out.println(map);
                    
                    map.remove(nums[i]);
                    continue;
                }
                if (nums[i] == k-nums[i] && map.get(k-nums[i])>1){
                    System.out.println(map);
                    max+=map.get(nums[i])/2;
                    map.remove(nums[i]);
                }else {
                max+=Math.min(map.get(nums[i]),map.get(k-nums[i]));
                map.remove(nums[i]);
                map.remove(k-nums[i]);
            }
            }
        }
        return max;
    }
}