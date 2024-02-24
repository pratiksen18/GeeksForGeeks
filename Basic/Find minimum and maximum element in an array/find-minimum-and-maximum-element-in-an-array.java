//User function Template for Java
/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/
// time complexity: O(n)
// Auxiliary Space: O(1)

class Solution {
    static Pair getMinMax(long a[], long n) {
        //Write your code here
        long min, max;
        min = max = a[0];
        for (int i = 1; i<n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            else if (a[i] > max) {
                max = a[i];
            }
        }
        return new Pair(min, max);
    }
}
