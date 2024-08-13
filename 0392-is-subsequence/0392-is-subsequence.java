class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int m= s.length();
        int pos=-1,flag=0;
        for(int i=0;i<m;i++){
            flag=0;
            for(int j=pos+1;j<n;j++){
                if(t.charAt(j)==s.charAt(i)){
                    pos=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                return false;
        }
        return true;
        
    }
    // int n=t.length();
    //     int m=s.length();
    //     int pos=-1,flag=0;
    //     for(int i=0;i<m;i++){
    //         flag=0;
    //         for(int j=pos+1;j<n;j++){
    //             if(t.charAt(j)==s.charAt(i)){
    //              pos=j;
    //              flag=1;break;
    //             }
    //         }
    //         if(flag==0)
    //         return false;
    //     }
    //     return true;
}