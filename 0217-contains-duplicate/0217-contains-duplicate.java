class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);

        // Check for consecutive duplicate elements
        for (int i = 0; i < nums.length - 1; i++) { // Loop up to nums.length - 2
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}