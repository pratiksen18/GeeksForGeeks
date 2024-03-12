//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:

	// Function to find maximum product subarray
	long long maxProduct(vector<int> arr, int n) {
	    // code here
	    long long int max1=INT_MIN;
         long long int  mul;
         long long int k;
        for(int i=0;i<n;i++){
             k=arr[i];
            mul=arr[i];
            for(int j=i+1;j<n;j++){
                mul*=arr[j];
                max1=max(max1,max(k,mul));
            }
        }
        return (max1==INT_MIN?mul:max(max1,k));
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        vector<int> arr(n);
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.maxProduct(arr, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends