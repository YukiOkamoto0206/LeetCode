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
class BFSSolution {
  public List<List<Integer>> levelOrder(TreeNode root) {
        Stack<List<TreeNode>> answer = new Stack<>();
        if (root == null) return new ArrayList<>();
        List<TreeNode> newRow = new ArrayList<>();
        newRow.add(root);
        answer.add(newRow);
        
        while (!answer.peek().isEmpty()) {
            newRow = new ArrayList<>();
            for (TreeNode node: answer.peek()) {
                if (node.left != null) newRow.add(node.left);
                if (node.right != null) newRow.add(node.right);
            }
            answer.add(newRow);
        }
        answer.pop();

        List<List<Integer>> realAnswer = new ArrayList<>();
        for (List<TreeNode> nodeList: answer) {
            List<Integer> list = new ArrayList<>();
            for (TreeNode node: nodeList) {
                list.add(node.val);
            }
            realAnswer.add(list);
        }
        return realAnswer;
    }
}
class DFSSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer= new ArrayList<>();
        dfs(root, answer, 0);
        return answer;
    }

    void dfs(TreeNode root, List<List<Integer>> answer, int level) {
        if (root == null) return;
        System.out.println(root.val);
        if (level >= answer.size()) answer.add(new ArrayList<>());
        answer.get(level).add(root.val);
        dfs(root.left, answer, level+1);
        dfs(root.right, answer, level+1);
    }
}
