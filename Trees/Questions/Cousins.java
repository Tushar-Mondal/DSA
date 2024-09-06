package Trees.Questions;

import Trees.BinaryTree;
//993

public class Cousins extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(isCousins(root,5, 4));
    }
    public static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy)));
    }

    private static boolean isSibling(TreeNode node, TreeNode xx, TreeNode yy) {
        if(node == null){
            return false;
        }
        return ((node.left == xx && node.right == yy) || (node.left == yy && node.right == xx) || isSibling(node.left, xx, yy) || isSibling(node.right, xx, yy));
    }

    private static TreeNode findNode(TreeNode node, int x) {
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode left = findNode(node.left, x);
        if(left != null){
            return left;
        }
        return findNode(node.right, x);
    }

    private static int level(TreeNode root, TreeNode node, int lev){
        if(root == null){
            return 0;
        }
        if(root == node){
            return lev;
        }
        int ans = level(node.left, root, lev+1);
        if(ans != 0){
            return ans;
        }
        return level(node.right, root, lev+1);
    }
}
