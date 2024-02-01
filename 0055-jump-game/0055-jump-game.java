class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition= nums.length-1;
        int rec=0;
        
        for(int idx=0; idx< nums.length;idx++){
            if(rec<idx) return false;
            rec = Math.max(rec, idx+nums[idx]);
        }
    return true;
    }
}