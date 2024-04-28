class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int[] charIndex = new int[128]; 
        
        for (int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }

        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            int charAscii = s.charAt(end);
            if (charIndex[charAscii] >= start) {
                start = charIndex[charAscii] + 1;
            }
            charIndex[charAscii] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
