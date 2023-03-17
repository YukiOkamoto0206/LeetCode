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
    static int ans;
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        ans = Integer.MAX_VALUE;
        helper(root, 1);
        return ans;
    }
    private static void helper(TreeNode root, int level) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (level < ans) {
                ans = level;
            }
        }
        helper(root.left, level+1);
        helper(root.right, level+1);
        return;
    }
}
