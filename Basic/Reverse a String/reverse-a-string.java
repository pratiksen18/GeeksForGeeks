// Time Complexity: O(|S|)
// Auxiliary Space: O(1)
class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        String s = "";
        for(int i = str.length()-1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }
}
