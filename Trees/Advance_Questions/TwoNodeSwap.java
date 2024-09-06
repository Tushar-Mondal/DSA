package Trees.Advance_Questions;

import Trees.BinaryTree;

public class TwoNodeSwap extends BinaryTree {
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void helper (TreeNode root){
        iot (root);
        // swap.
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void iot (TreeNode node){
        if (node == null){
            return;
        }
        iot(node.left);
        if (prev != null && node.val < prev.val){
            if (first == null){
                first = prev;
            }else {
                second = node;
            }
        }
        prev = node;
        iot(node.right);
    }
}