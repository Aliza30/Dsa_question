class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
         int[] resultArray = new int[2];

        // Initialize hashmap to store previously checked values.
        // Key of map will store value in array and value of map will store index in array.
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // (target - nums[i]) exits in map then store indices in results. That's the answer.
            if (map.get(target - nums[i]) != null) {
                resultArray[0] = i;
                resultArray[1] = map.get(target - nums[i]);
                break;
            } else map.put(nums[i] , i);
        }
        return resultArray;
    }
}
