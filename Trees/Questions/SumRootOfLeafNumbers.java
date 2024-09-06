package Trees.Questions;

import Trees.BinaryTree;

public class SumRootOfLeafNumbers extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumNumbers(root));
    }
    public static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    private static int helper (TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = sum * 10 + node.val;
        if(node.left == null && node.right == null){
            return sum;
        }
        return helper(node.left, sum) + helper(node.right, sum);
    }
}
