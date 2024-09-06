package Trees.Questions;

import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountPaths extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        System.out.println(count(root, 9));
    }
    public static int count (TreeNode root, int targetSum){
        List<Integer> path = new ArrayList<>();
        return helper(root, targetSum, path);
    }
    private static int helper(TreeNode node, int targetSum, List<Integer> path){
        if(node == null){
            return 0;
        }
        path.add(node.val);
        int count = 0;
        int sum = 0;
        //How many paths I can make.
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()){
           sum += itr.previous();
           if(sum == targetSum){
               count++;
           }
        }
        count += helper(node.left, targetSum, path) + helper(node.right, targetSum, path);
        //Back track.
        path.remove(path.size() - 1);
        return count;
    }
}
