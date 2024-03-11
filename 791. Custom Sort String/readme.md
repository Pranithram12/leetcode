public class Solution {
    public String customSortString(String order, String str) {
        // Create two StringBuilder objects to store the sorted and unsorted parts of the string
        StringBuilder s1 = new StringBuilder();  // s1 will store the sorted part
        StringBuilder s2 = new StringBuilder();  // s2 will store the unsorted part

        // Create an array to store the count of each character in the 'order' string
        int[] a = new int[26];

        // Count the occurrences of each character in the 'order' string
        for (char c : order.toCharArray()) {
            a[c - 'a']++;
        }

        // Process each character in the input string 'str'
        for (char c : str.toCharArray()) {
            // If the character is not in the 'order' string, append it to the unsorted part
            if (a[c - 'a'] == 0) {
                s2.append(c);
            } else {
                // If the character is in the 'order' string, increment its count in the array
                a[c - 'a']++;
            }
        }

        // Process each character in the 'order' string
        for (char c : order.toCharArray()) {
            // Append the character to the sorted part while its count is greater than 1
            while (a[c - 'a'] > 1) {
                s1.append(c);
                a[c - 'a']--;
            }
        }

        // Return the concatenated result of the sorted and unsorted parts
        return s1.toString() + s2.toString();
    }
}

