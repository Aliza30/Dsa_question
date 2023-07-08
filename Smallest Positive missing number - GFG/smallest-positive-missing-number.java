//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int n = arr.length;

        // Initialize a boolean array to mark the presence of elements.
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i] - 1] = true;
            }
        }

        // Find the first index where the element is not present.
        int smallestMissingNumber = 1;
        while (smallestMissingNumber <= n) {
            if (!present[smallestMissingNumber - 1]) {
                break;
            }
            smallestMissingNumber++;
        }

        return smallestMissingNumber;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends