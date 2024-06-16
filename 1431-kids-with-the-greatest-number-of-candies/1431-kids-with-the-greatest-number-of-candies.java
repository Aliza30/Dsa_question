class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int great=0;
        ArrayList<Boolean> result= new ArrayList<>();
        for(int i:candies){
            if(i > great)
                great=i;
        }
        for(int i: candies){
            if(i+extraCandies >= great){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}