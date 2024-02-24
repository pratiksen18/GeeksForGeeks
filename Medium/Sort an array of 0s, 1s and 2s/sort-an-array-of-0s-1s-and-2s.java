
//User function template for Java

class Solution {
    public static void sort012(int a[], int n) {
        // code here 
        int arr[] = new int[3];
        for(int i = 0; i < n; i++)
            arr[a[i]] += 1;
            int k = 0;
        for(int i = 0; i < 3; i++){
            int p = arr[i];
            while(p --> 0){
                a[k++] = i;
            }
        }
    }
}
