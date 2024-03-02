class Solution {
    public int[] sortedSquares(int[] nums) {
        // 1st approch:
        // int[] sqrar= new int[nums.length];
        // for(int i=0; i< nums.length;i++){
        //     sqrar[i]= nums[i]*nums[i];
        // }
        // Arrays.sort(sqrar);
        // return sqrar;
        
        
        //Approch2:
        for(int i=0; i< nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        }
}