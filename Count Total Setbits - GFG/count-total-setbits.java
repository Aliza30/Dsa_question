//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long N;
            N = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.countBits(N);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long countBits(long N) {
        // code here
           // code here
        if(N==0)
        {
            return 0;
        }
        int pow=maxpow(N);
        long bits_under_maxpow=pow*(1<<(pow-1));
        long msb_cnt=N-(1<<pow)+1;
        long rest=N-(1<<pow);
        
        long ans=bits_under_maxpow+msb_cnt+countBits(rest);
        
        return ans;
    }
    public static int maxpow(long n)
    {
        int x=0;
        while((1<<x)<=n)
        {
            x++;
        }
        return x-1;
    }
}
        
