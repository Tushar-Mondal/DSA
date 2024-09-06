package Trees;

public class BST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.populateSorted(new int[]{1,2,3,4,5,6,7,8,9,10});
        tree.display();
        System.out.println(tree.balanced());
    }

    public static class Node {
        int height;
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right, int height) {
            this.value = value;
            this.left = left;
            this.right = right;
            this.height = height;
        }
    }
    Node root;

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty (){
        return root == null;
    }

    public void display(){
        display(root, "Root nodal: ");
    }

    public void display(Node node, String details) {
        if (node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, STR."Left child of \{node.value} is ");
        display(node.right, STR."Right child of \{node.value} is ");
    }

    public void insert (int value){
        root = insert(value, root);
    }

    private Node insert (int value, Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }

        if  (value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height =  Math.max(height(node.right),  height(node.left)) + 1;

        return node;
    }

    public boolean balanced (){
        return balanced(root);
    }

    public void populate (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populateSorted (int[] arr){
        populateSorted(arr, 0, arr.length);
    }

    public void populateSorted(int[] arr, int start, int end) {
        if (start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    public boolean balanced(Node root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.right) - height(root.left)) <= 1 && balanced(root.right) && balanced(root.left);
    }
}
