package Trees.Questions;

import Trees.BinaryTree;

public class InvertBinaryTree extends BinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(7);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(9);
        tree.root = invertTree(tree.root);
        tree.prettyDisplay();
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        //return invert(root);This is my approach to the problem.

        // Now this is kunal's approach.
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    private static TreeNode invert(TreeNode node) {
        if(node.left == null && node.right == null){
            return node;
        }
        if(node.left == null || node.right == null){
            if(node.left != null){
                node.right = node.left;
                node.left = null;
            }else {
                node.left = node.right;
                node.right = null;
            }
        }
        if(node.left != null && node.right != null){
            TreeNode temp = node.right;
            node.right = node.left;
            node.left = temp;
        }
        if(node.left != null){
            node.left = invert(node.left);
        }
        if(node.right != null){
            node.right = invert(node.right);
        }
        return node;
    }
}
