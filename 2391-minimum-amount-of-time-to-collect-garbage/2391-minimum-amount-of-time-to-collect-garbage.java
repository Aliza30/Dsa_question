class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
         return fun(garbage,'M',travel) + fun(garbage,'P',travel) + fun(garbage,'G',travel);
    }

    public int fun(String[] garbage, char c,int[] travel){
        int m = 0;
        int step = 0;
        int x = 0;
        for(int i = 0; i < garbage.length; i++){
            if(i !=0 ){
                step += travel[i-1];
            }
            for(int j = 0; j < garbage[i].length(); j++){
                if(garbage[i].charAt(j) == c){
                    m += step+1;
                    step = 0;
                }
            }
        }
        return m;
    }
}