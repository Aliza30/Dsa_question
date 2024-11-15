class Solution {
    public List<Integer> countSmaller(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            min = Math.min(min, num);
        }
        
        // Fenwick tree
        int[] ftree = new int[(int)1e4 + (int)1e4 + 1]; 
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = nums.length - 1; 0 <= i; i--) {
            
            ans.add(query(ftree, nums[i] - min));

            update(ftree, nums[i] - min + 1);
        }

        Collections.reverse(ans);
        return ans;
    }
    private void update(int[] ftree, int val) {
        while(val < ftree.length) {
            ftree[val]++;
            val += val & (-val);
        }
    }
    private int query(int[] ftree, int val) {
        int sum = 0;
        while(0 < val) {
            sum += ftree[val];
            val -= val & (-val);
        }
        return sum;
    }
}