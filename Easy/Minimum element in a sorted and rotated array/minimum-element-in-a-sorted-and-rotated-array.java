//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int beg = 0, end = n-1;
        int mid = 0;
        while( beg+1 < end){
            mid = (beg + end)/2;
            if((arr[beg] < arr[mid])&& (arr[end] < arr[mid])){
                 beg = mid;
            }else{
                end=mid;
            }
        }
        if( arr[beg] < arr[end]) mid = beg;
        else mid= end;
        return arr[mid];
    }
}
