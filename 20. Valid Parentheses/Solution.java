class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char[] stack = new char[n];
        int pos = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[pos] = c;
                pos++;
            } 
            else {
                if (pos == 0)
                    return false;

                if (c == ')' && stack[pos - 1] != '(')
                    return false;

                if (c == ']' && stack[pos - 1] != '[')
                    return false;

                if (c == '}' && stack[pos - 1] != '{')
                    return false;

                pos--;
            }
        }
        return pos == 0;
    }       
}