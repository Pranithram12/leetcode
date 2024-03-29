import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int maxlen = 0;
        int n = nums.length;
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        while (end < n) {
            // Expansion phase
            freqmap.put(nums[end], freqmap.getOrDefault(nums[end], 0) + 1);

            // Shrinking phase
            while (freqmap.get(nums[end]) > k) { 
                freqmap.put(nums[start], freqmap.get(nums[start]) - 1);
                start++;
            }
            maxlen = Math.max(maxlen, end - start + 1);
            end++; 
        }
        return maxlen;
    }
}
