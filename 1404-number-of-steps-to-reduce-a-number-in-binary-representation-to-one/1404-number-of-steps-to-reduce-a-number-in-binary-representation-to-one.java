class Solution {
    public int numSteps(String s) {
        int count=0;
        int n=s.length();int flag=0;int sign=0;
        for(int i=n-1;i>0;i--)
        {
           if(flag==0)
           {
            if(s.charAt(i)=='0')
            count++;
            else
            {
                flag=1;
                count=count+2;
                sign=1;
            }
           }
           else
           {
            if(s.charAt(i)=='1')
            count++;
            else
            {
                flag=1;
                count=count+2;
            }
           }
        }

        return sign==1?count+1:count;  
    }
}