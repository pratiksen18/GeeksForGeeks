// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    int findFrequency(int Arr[], int X) {
        int freq = 0;
        for(int i = 0; i < Arr.length; i++) {
            if(Arr[i] == X){
                freq++;
            }
        }
        return freq;
    }
}
