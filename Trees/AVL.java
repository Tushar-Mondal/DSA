package Trees;

public class AVL extends BST{
    static Node root;
    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        tree.prettyDisplay();
    }

    @Override
    public void insert(int value) {
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

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (this.height(node.left) - this.height(node.right) > 1){
            //Left heavy.
            if (this.height(node.left.left) - this.height(node.left.right) > 0){
                //Left left case.
                return rightRotate(node);
            }

            if (this.height(node.left.left) - this.height(node.left.right) < 0){
                //Left right case.

                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (this.height(node.left) - this.height(node.right) < -1){
            //Right heavy.
            if (this.height(node.right.left) - this.height(node.right.right) < 0){
                //Right right case.
                return leftRotate(node);
            }

            if (this.height(node.right.left) - this.height(node.right.right) > 0){
                //Right left case.

                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    Node temp = null;
    private Node leftRotate(Node node) {
        temp = node;
        node = node.right;
        temp.right = node.left;
        node.left = temp;
        temp.height = Math.max(height(temp.left), height(temp.right) + 1);
        node.height = Math.max(height(node.left), height(node.right) + 1);
        return node;
    }

    private Node rightRotate(Node node) {
        temp = node;
        node = node.left;
        temp.left = node.right;
        node.right = temp;
        temp.height = Math.max(height(temp.left), height(temp.right) + 1);
        node.height = Math.max(height(node.left), height(node.right) + 1);
        return node;
    }

    public void prettyDisplay (){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level) {
        if (node == null){
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t\t");
            }
            System.out.println(STR." |-----> \{node.value} ");
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}
