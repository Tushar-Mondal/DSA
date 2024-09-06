package Trees.Questions;

import Trees.BinaryTree;

public class ConvertSortedArrToBST extends BinaryTree {
    static TreeNode root;
    public static void main(String[] args) {
        int[] nums = new int[]{-90,-84,-76,-72,-40,-34,-9,8,19,33,50,51,56,68,79,81};
        BinaryTree tree = new BinaryTree();
        ConvertSortedArrToBST bst = new ConvertSortedArrToBST();
        tree.root = bst.sortedArrayToBST(nums);
        tree.prettyDisplay();
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        insert(nums, 0, nums.length - 1);
        return root;
    }
    public void insert(int[] nums, int start, int end) {
        if (start > end){
            return;
        }
        int mid = end - (end - start)/2;
        root = insert(nums[mid], root);
        insert(nums, 0, mid - 1);
        insert(nums, mid + 1, end);
    }

    private TreeNode insert (int value, TreeNode node){
        if (node == null){
            node = new TreeNode(value);
            return node;
        }

        if  (value < node.val){
            node.left = insert(value, node.left);
        }

        if(value > node.val){
            node.right = insert(value, node.right);
        }

        return node;
    }
}
