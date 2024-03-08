class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
             map.put(i,map.getOrDefault(i,0)+1);
        }

        int maxfreq=0;
        for(int i:map.values())
        {
           maxfreq=Math.max(i,maxfreq);
        }
        int res=0;
        for(int count:map.values())
        {
            if(count==maxfreq) res=res+count;
        }
        return res;
    }
}