// Time Complexity: O(n*logn)
// Space Complexity: O(1)
class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    } 
}
