class Solution {
    public int removeDuplicates(int[] nums) {
      int p=1;//two Pointer Approch
        for(int  i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[p]=nums[i];
                p+=1;
            }
        }
        return p;
        
    }
}