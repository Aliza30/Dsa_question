class Solution {
    public int[] beautifulArray(int n) {
     ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);
    while (ans.size() < n) {
      ArrayList<Integer> tmp = new ArrayList<>();
      for (int el : ans)   {
        if(2*el -1<=n)
          tmp.add(el * 2 - 1);
      }
      for (int el : ans) {
        if(2*el <=n)
          tmp.add(el * 2);
      }
      ans = tmp;
    }
    int[] res = new int[n];
    for(int i=0;i<n;i++){
      res[i] = ans.get(i);
    }
    return res;
    }
}