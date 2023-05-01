//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
      if (k > 0 && k <= r - l + 1) {
            int pivotIndex = partition(arr, l, r);
            if (pivotIndex - l == k - 1) {
                return arr[pivotIndex];
            } else if (pivotIndex - l > k - 1) {
                return kthSmallest(arr, l, pivotIndex - 1, k);
            } else {
                return kthSmallest(arr, pivotIndex + 1, r, k - pivotIndex + l - 1);
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }
}
