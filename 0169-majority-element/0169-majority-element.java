class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x: map.keySet()){
            if(map.get(x)>nums.length/2)
                return x;
        }
                return -1;

    }
}