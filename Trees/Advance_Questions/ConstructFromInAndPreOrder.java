package Trees.Advance_Questions;

import Trees.BinaryTree;

import java.util.HashMap;

public class ConstructFromInAndPreOrder extends BinaryTree {
    public static int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper (preorder,0, preorder.length - 1, map);
    }
    public static TreeNode helper (int[] preOrder, int left, int right, HashMap<Integer, Integer> map){
        if(left > right){
            return null;
        }
        int current = preOrder[index++];
        TreeNode node = new TreeNode(current);
        if (left == right){
            return node;
        }
        int inOrderIndex = map.get(current);
        node.left = helper(preOrder, left, inOrderIndex - 1, map);
        node.right = helper(preOrder, inOrderIndex + 1, right, map);
        return node;
    }
}
