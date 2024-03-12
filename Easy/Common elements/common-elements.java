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
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> arrl = new ArrayList<>();
        for(int i=0;i<n1;i++){
            if((binarySearch(A[i],B)==true)){
                if((binarySearch(A[i],C)==true)){
                    if(!arrl.contains(A[i])){
                        arrl.add(A[i]);
                    }
                }
            }
        }
        return arrl;
    }
    public boolean binarySearch(int num,int[] arr){
        int beg = 0;
        int end = arr.length - 1;
        while(beg<=end){
            int mid = beg + (end-beg)/2;
            if(arr[mid]>num){
                end = mid - 1;
            }else if(arr[mid]<num){
                beg = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}