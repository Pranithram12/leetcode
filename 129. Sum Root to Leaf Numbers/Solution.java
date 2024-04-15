/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return getLeafSum(root, 0);
    }

    public int getLeafSum(TreeNode root, int currNum) {
        if (root == null) {
            return 0; // Return 0 for null nodes
        }

        currNum = currNum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return currNum; // Return the current number for leaf nodes
        }

        int leftSum = getLeafSum(root.left, currNum);
        int rightSum = getLeafSum(root.right, currNum);

        return leftSum + rightSum; // Return the sum of left and right subtrees
    }
}
