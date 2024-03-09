package leetcode.palindrome;
import java.lang.System;
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

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

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();

        // Test cases
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(num1 + " is a palindrome: " + solution.isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + solution.isPalindrome(num2));
        System.out.println(num3 + " is a palindrome: " + solution.isPalindrome(num3));
    }
}
