class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
       if (!count.containsKey(nums[i]))
                count.put(nums[i],1);
            else
                count.put(nums[i],count.get(nums[i])+1);
             if (count.containsKey(nums[i]) && count.get(nums[i]) > nums.length/2)
            return nums[i];
        }
   return -1;
    }
}