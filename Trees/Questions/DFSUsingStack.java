package Trees.Questions;

import Trees.BinaryTree;

import java.util.Stack;

public class DFSUsingStack extends BinaryTree{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.right.left = new TreeNode(18);
        dfsStack(root);
    }
    public static void dfsStack (TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        // This is Preorder.
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            System.out.print(STR."\{current.val} -> ");
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
        System.out.println("End");
        //This is inorder.
        TreeNode current = root;
        while (current != null || stack.size() > 0){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(STR."\{current.val} -> ");
            current = current.right;
        }
        System.out.println("End");
        // postorder 
    }
}
