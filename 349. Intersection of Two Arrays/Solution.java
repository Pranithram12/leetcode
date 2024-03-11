public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                intersectionSet.add(i);
            }
        }
        int size = intersectionSet.size();
        int[] ans = new int[size];
        int index = 0;

        for (int i : intersectionSet) {
            ans[index++] = i;
        }

        return ans;
    }
}

