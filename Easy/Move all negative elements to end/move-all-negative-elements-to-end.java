
//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n) {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        int idx = 0;
        for (int num : pos) {
            arr[idx++] = num;
        }
        for (int num : neg) {
            arr[idx++] = num;
        }
    }
}
