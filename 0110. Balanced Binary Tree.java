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
    //isBalanced: N
    //height: N
    // O(N^2)
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left); // O(N)
        int right = height(root.right);// O(N)
        return (Math.abs(left-right) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }
    int height(TreeNode root) {//20/15
        if (root == null) return 0;
        int left = height(root.left);//0
        int right = height(root.right);//0
        return Math.max(left, right) + 1;//2
    }
}
