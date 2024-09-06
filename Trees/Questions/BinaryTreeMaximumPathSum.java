package Trees.Questions;

import Trees.BinaryTree;

public class BinaryTreeMaximumPathSum extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));
    }
    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    private static int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);
        left = Math.max(0, left);
        right = Math.max(0, right);
        int pathSum = left + right + node.val;
        max = Math.max(max, pathSum);
        return Math.max(left, right) + node.val;
    }
}
