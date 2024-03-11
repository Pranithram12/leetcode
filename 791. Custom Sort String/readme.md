# Sorting Strings Based on Order

This Java program demonstrates how to sort a given string based on a specified order. The algorithm uses two `StringBuilder` objects (`s1` for the sorted part and `s2` for the unsorted part) and an array to store the count of each character in the 'order' string.

## Implementation Details

1. **Initialize StringBuilder Objects:**
   - `s1` is used to store the sorted part.
   - `s2` is used to store the unsorted part.

   ```java
   StringBuilder s1 = new StringBuilder();
   StringBuilder s2 = new StringBuilder();
Count Character Occurrences:

Create an array to store the count of each character in the 'order' string.
java
Copy code
int[] a = new int[26]; // Assuming lowercase English alphabets
for (int i = 0; i < order.length(); i++) {
    char c = order.charAt(i);
    a[c - 'a']++;
}
Process Characters in the Input String:

Iterate through each character in the input string 'str'.
Append characters not in the 'order' string to the unsorted part (s2).
Increment the count of characters in the 'order' string.
java
Copy code
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    if (a[c - 'a'] == 0) {
        s2.append(c);
    } else {
        a[c - 'a']++;
    }
}
Process Characters in the 'Order' String:

Iterate through each character in the 'order' string.
Append the character to the sorted part (s1) while its count is greater than 1.
java
Copy code
for (int i = 0; i < order.length(); i++) {
    char c = order.charAt(i);
    while (a[c - 'a'] > 1) {
        s1.append(c);
        a[c - 'a']--;
    }
}
Return Concatenated Result:

Return the concatenated result of the sorted and unsorted parts.
java
Copy code
return s1.toString() + s2.toString();