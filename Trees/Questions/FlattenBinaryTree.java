package Trees.Questions;

import Trees.BinaryTree;

public class FlattenBinaryTree extends BinaryTree {
    public void flatten(TreeNode root) {
        while (root != null){
            if(root.left != null){
                TreeNode temp = root.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                if(root.right != null){
                    temp.right = root.right;
                }
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
