class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       int sum1 = 0, sum2 = 0;
       int n = nums1.length; // Corrected spelling to length
       for (int i = 0; i < n; i++) { // Changed n++ to i++
           sum1 = sum1 + nums1[i];
           sum2 += nums2[i];
       }
       int dif = sum2 - sum1;
       return (int) Math.round((double) dif / n);
    }
}