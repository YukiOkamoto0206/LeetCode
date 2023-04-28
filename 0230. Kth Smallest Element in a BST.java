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
    public int kthSmallest(TreeNode root, int k) {
        int[] data = new int[2];
        data[0] = 0;
        data[1] = k;
        checkAllNodes(root, data);
        return data[0];
    }
    void checkAllNodes(TreeNode node, int[] data) {
        if (node == null) return;
        checkAllNodes(node.left, data);
        if (--data[1] == 0) {
            data[0] = node.val;
        }
        checkAllNodes(node.right, data);
    }
}
