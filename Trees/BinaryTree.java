package Trees;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
//        tree.prettyDisplay();
//        tree.preOrder();
//        tree.inOrder();
        tree.postOrder();
    }

    public BinaryTree() {
        int size = 0;
    }

    public static class TreeNode {
        public int val;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(int value) {
            this.val = value;
        }

        public TreeNode(int value, TreeNode right, TreeNode left) {
            this.val = value;
            this.right = right;
            this.left = left;
        }
    }

    public TreeNode root;

    public void populate (Scanner in){
        System.out.print("Enter the root nodal value : ");
        int value = in.nextInt();
        root = new TreeNode(value);
        populate(in, root);
    }

    public void populate(Scanner in, TreeNode root) {
        System.out.print(STR."Do you want to enter left of \{root.val} : ");
        boolean left = in.nextBoolean();
        if(left) {
            System.out.print(STR."Enter the value of the left \{root.val} : ");
            int value = in.nextInt();
            root.left = new TreeNode(value);
            populate(in, root.left);
        }
        System.out.print(STR."Do you want to enter right of \{root.val} : ");
        boolean right = in.nextBoolean();
        if(right) {
            System.out.print(STR."Enter the value of the right \{root.val} : ");
            int value = in.nextInt();
            root.right = new TreeNode(value);
            populate(in, root.right);
        }
    }

    public void display(){
        display(root, "");
    }

    public void display(TreeNode node, String indent) {
        if (node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, STR."\{indent}\t");
        display(node.right, STR."\{indent}\t");
    }

    public void prettyDisplay (){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(TreeNode node, int level) {
        if (node == null){
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print(" |\t\t");
            }
            System.out.println(STR." |---------> \{node.val}");
        }else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.print(STR."\{node.val} ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(STR."\{node.val} ");
        inOrder(node.right);
    }

    public void  postOrder (){
        postOrder(root);
    }

    public void postOrder(TreeNode node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(STR."\{node.val} ");
    }
}
