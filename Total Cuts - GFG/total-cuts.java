//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int ans = 0, leftMax = -1, rightMin = Integer.MAX_VALUE;
        int[] left = new int[N];
        int[] right = new int[N];
        for(int i=0; i<N; i++){
            leftMax = Math.max(leftMax, A[i]);
            left[i] = leftMax;
        }
        for(int i=N-1; i>=0; i--){
            rightMin = Math.min(rightMin, A[i]);
            right[i] = rightMin;
        }
        
        for(int i=1; i<N; i++){
            if(left[i-1] + right[i] >= K) ans++;
        }
        return ans;
    }
}
        
