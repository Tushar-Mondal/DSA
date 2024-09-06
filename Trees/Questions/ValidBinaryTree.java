package Trees.Questions;

import Trees.BinaryTree;

public class ValidBinaryTree extends BinaryTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer low, Integer high) {
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
             return false;
        }

        return isValidBST(node.left, low, node.val) && isValidBST(node.right, node.val, high);
    }
}
