/*Complete the function below*/
// Time Complexity: O(log(n))
// Space Complexity; O(1)
class Solution {
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n) {
        	//add code here.
        	if(n == 1) {
            		return 0;
        	}
        	if(arr[0] > arr[1]) {
              		return 0;
        	}
        	if(arr[n-1] > arr[n-2]) {
            		return n-1;
        	}
        	int beg = 1;
        	int end = n-1;
        	while(beg <= end){
            		int mid = (beg + end) / 2;
            		if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1]) {
                		return mid;
            		}
            		else if(arr[mid] > arr[mid-1]) {
                		beg = mid + 1;
            		}
            		else {
                		end = mid - 1;
            		}
        	}
        	return -1;
    	}
}

