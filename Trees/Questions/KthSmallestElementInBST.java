package Trees.Questions;

import Trees.BinaryTree;

public class KthSmallestElementInBST extends BinaryTree {
    int ans = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }
    private void helper(TreeNode node, int k) {
        if (node == null){
            return;
        }
        helper(node.left, k);
        count++;
        if(count == k){
            ans = node.val;
            return;
        }
        helper(node.right, k);
    }
}
