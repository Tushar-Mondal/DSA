package Trees.Questions;

import Trees.BinaryTree;

public class ExistsPath extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(12);
        root.right.left.left = new TreeNode(16);
        root.right.right.left = new TreeNode(8);
        int[] path = new int[]{3,9,10,16};
        System.out.println(isExists(root, path));
    }
    public static boolean isExists (TreeNode root, int[] path) {
        if (root == null) {
            return path.length == 0;
        }
        return helper(root, path, 0);
    }
    private static boolean helper(TreeNode node, int[] path, int index){
        if(node == null){
            return false;
        }
        if(index == path.length || node.val != path[index]){
            return false;
        }
        if(node.left == null && node.right == null && index == path.length - 1){
            return true;
        }
        return helper(node.left, path, index + 1) || helper(node.right, path, index + 1);
    }
}
