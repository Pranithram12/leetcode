-Create two StringBuilder(s1,s2) objects to store the sorted and unsorted parts of the string
    -s1 will store the sorted part
    -s2 will store the unsorted part
-Create an array to store the count of each character in the 'order' string

-Count the occurrences of each character in the 'order' string and add it to the array.
     ```java
    for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            a[c - 'a']++;
    }

-Process each character in the input string 'str'
    ```java  
    for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If the character is not in the 'order' string, append it to the unsorted part
            if (a[c - 'a'] == 0) {
                s2.append(c);
            } else {
                // If the character is in the 'order' string, increment its count in the array
                a[c - 'a']++;
            }
    }

-Process each character in the 'order' string
     ```java
    for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            // Append the character to the sorted part while its count is greater than 1
            while (a[c - 'a'] > 1) {
                s1.append(c);
                a[c - 'a']--;
            }
     }

-Return the concatenated result of the sorted and unsorted parts
        ```java
        return s1.toString() + s2.toString();