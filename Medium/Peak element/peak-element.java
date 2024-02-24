//{ Driver Code Starts
import java.util.*;
import java.io.*;
class PeakElement{
	public static void main(String[] args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(in.readLine().trim());
			int[] a=new int[n];
		    int[] tmp=new int[n];
		    String s[]=in.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(s[i]);
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    out.println(f);
			}
		}
		out.close();
	}
}
// } Driver Code Ends

/* Given an 0-indexed array of integers arr[] of size n, find its peak element. An element is considered
to be peak if it's value is greater than or equal to the values of its adjacent elements (if they exist).
The array is guaranteed to be in ascending order before the peak element and in descending order after it.

Note: The output will be 1 if the index returned by your function is correct; otherwise, it will be 0.

Example 1:
----------
Input: 
n = 3
arr[] = {1, 2, 3}
Peak Element's Index: 2
Output: 1
Explanation: 
If the index returned is 2, then the output printed will be 1. 
Since arr[2] = 3 is greater than its adjacent elements, and 
there is no element after it, we can consider it as a peak 
element. No other index satisfies the same property.

Example 2:
----------
Input:
n = 3
arr[] = {3, 4, 2}
Peak Element's Index: 1
Output: 1
Explanation: 
If the index returned is 1, then the output printed will be 1.
Since arr[1] = 4 is greater than its adjacent elements, and
there is no element after it, we can consider it as a peak
element. No other index satisfies the same property.

Your Task:
You don't have to read input or print anything. Complete the function peakElement() which takes the
array arr[] and its size n as input parameters and return the index of the peak element.

Expected Time Complexity: O( log(n) ).
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 106
*/


/*Complete the function below*/
// Time Complexity: O(log(n))
// Space Complexity; O(1)
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        //add code here.
        if(n == 1){
            return 0;
        }
        if(arr[0] > arr[1]){
              return 0;
        }
        if(arr[n-1] > arr[n-2]){
            return n-1;
        }
        int beg = 1;
        int end = n-1;
        while(beg <= end){
            int mid = (beg + end) / 2;
            if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid-1]){
                beg = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}