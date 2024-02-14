class Solution {
    public int[] rearrangeArray(int[] nums) {

    int[] rearranged = new int[nums.length];
    int positiveIndex = 0;
    int negativeIndex = 1;

    for (int num : nums) {
      if (num >= 0) {
        rearranged[positiveIndex] = num;
        positiveIndex += 2;
      } else {
        rearranged[negativeIndex] = num;
        negativeIndex += 2;
      }
    }

    return rearranged;
  }
    
}