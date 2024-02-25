
// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
