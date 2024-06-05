class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String strX = String.valueOf(x);

        // Use two pointers approach to check for palindrome
        int left = 0;
        int right = strX.length() - 1;

        while (left < right) {
            if (strX.charAt(left) != strX.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;  
    }
}