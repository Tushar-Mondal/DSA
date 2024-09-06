package Trees.Questions;

//116

public class PopulatingNextRightPointerInEachNode {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Node leftMost = root;
        while (leftMost.left != null){
            Node current = leftMost;
            while (current != null){
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
    public static class Node{
        int val;
        Node next;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
