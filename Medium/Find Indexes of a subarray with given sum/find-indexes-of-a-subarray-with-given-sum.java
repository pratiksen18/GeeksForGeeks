// Time Complexity: O(N)
// Auxiliary Space: O(1)

class Solution {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> output = new ArrayList<>();
        int sum = 0, j = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            while(sum > s && j < i){
                sum -= arr[j];
                j++;
            }
            if(sum == s){
                output.add(j+1);
                output.add(i+1);
                return output;
            }
        }
        output.add(-1);
        return output;
    }
}
