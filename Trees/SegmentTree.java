package Trees;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,7,6,-2,-8,-4,9};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.root.data);
        tree.display();
    }
    Node  root;
    public SegmentTree(int[] arr) {
        //Create a  tree using this array.
        root = constructTree(arr, 2, 5);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){
            //We are in leaf nodal.
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        //Create new nodal with index you  are at.
        Node node = new Node(start, end);
        int mid = start + (end - start)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public static class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start, int end) {
           this.start = start;
           this.end = end;
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null){
            str += STR."Interval = [\{node.left.start}-\{node.left.end}] and data : \{node.left.data} + -> ";
        }else {
            str += "No left child\n";
        }
        str += STR."Interval = [\{node.start}-\{node.end}] and data : \{node.data} + <- ";
        if (node.right != null){
            str = STR."\{str}Interval = [\{node.right.start}-\{node.right.end}] and data : \{node.right.data}";
        }else {
            str += "No right child\n";
        }
        System.out.println(str + "\n");

        if (node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }
    //Future Tushar this func doesn't needed for doing the sum because of the beauty of above construct tree func it's only creating that nodal which is needed for the sum.
//    public int query (int qsi, int qei){
//        return query(root, qsi, qei);
//    }
//
//    private int query(Node nodal, int qsi, int qei) {
//        if(nodal.start >= qsi && nodal.end <= qei){
//            //Node is completely lying inside query
//            return nodal.data;
//        } else if (nodal.start > qei || nodal.end < qsi) {
//            //Completely outside.
//            return 0;
//        } else {
//            return query(nodal.left, qsi, qei) + query(nodal.right, qsi, qei);
//        }
//    }
}
