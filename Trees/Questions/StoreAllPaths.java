package Trees.Questions;

import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StoreAllPaths extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        root.right.right.right.left = new TreeNode(8);
        System.out.println(Arrays.toString(new List[]{store(root, 9)}));
    }
    public static List<List<Integer>> store (TreeNode root, int targetSum){
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helperf(root, targetSum, paths, path);
        return paths;
    }
    // This function will find the path from root to ih the depth.
    private static void helper (TreeNode node, int targetSum, List<List<Integer>> paths, List<Integer> path){
        if(node == null){
            return;
        }
        path.add(node.val);
        if(node.val == targetSum){
            paths.add(new ArrayList<>(path));
        }else {
            helper(node.left, targetSum - node.val, paths, path);
            helper(node.right, targetSum - node.val, paths, path);
        }
        path.remove(path.size() - 1);
    }
    // This function might able to find from any nodal.
    private static void helperf (TreeNode node, int targetSum, List<List<Integer>> paths, List<Integer> path){
        if(node == null){
            return;
        }
        path.add(node.val);
        int sum = 0;
        ListIterator<Integer> itr = path.listIterator(path.size());
        List<Integer> list = new ArrayList<>();
        while (itr.hasPrevious()){
            list.add(itr.previous());
            sum += list.getLast();
            if(sum == targetSum){
                paths.add(new ArrayList<>(list.reversed()));
            }
        }
        helperf(node.left, targetSum, paths, path);
        helperf(node.right, targetSum, paths, path);
        path.remove(path.size() - 1);
    }
}
