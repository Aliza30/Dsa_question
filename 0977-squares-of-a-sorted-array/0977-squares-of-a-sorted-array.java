class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqrar= new int[nums.length];
        for(int i=0; i< nums.length;i++){
            sqrar[i]= nums[i]*nums[i];
        }
        Arrays.sort(sqrar);
        return sqrar;
        }
}