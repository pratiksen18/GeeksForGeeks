//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                count++;
            }
            if(count == 1)
            return arr[i];
        }
        return 0;
    }  
    
}

