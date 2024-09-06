package Trees.Questions;

import Trees.BinaryTree;

import java.util.Arrays;

public class ConstructFromInAndPreOrder extends BinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        int index = 0;
        while (index < inorder.length && inorder[index] != preorder[0]){
            index++;
        }
        TreeNode node = new TreeNode(preorder[0]);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return node;
    }
}
