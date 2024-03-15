class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1;i < nums.length; i++)
        {
            prefix[i]  = nums[i-1] * prefix[i -1];
        }
        int suffix = 1;
        for (int i = nums.length-1; i>=0;  i--)
        {
        prefix[i] = prefix[i] * suffix;
        suffix = suffix * nums[i];
        }

    return prefix;
    }
}