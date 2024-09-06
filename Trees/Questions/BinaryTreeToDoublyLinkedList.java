package Trees.Questions;

import Trees.BinaryTree;

public class BinaryTreeToDoublyLinkedList extends BinaryTree{
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        BtreeToLinkedList(root);
        // If you want to run the code create a tree then pretty print it.
    }
    public static void BtreeToLinkedList (TreeNode node){
        if (node == null){
            return;
        }
        BtreeToLinkedList(node.left);
        Node newNode = new Node(node.val);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        BtreeToLinkedList(node.right);
    }
    public static class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
