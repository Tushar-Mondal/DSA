package HashMaps;

import Trees.BinaryTree;

import java.util.HashSet;

public class TwoSum4 extends BinaryTree {
    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hasSet = new HashSet<>();
        return helper(root, k, hasSet);
    }
    public static boolean helper (TreeNode node, int k, HashSet<Integer> hasSet){
        if (node == null){
            return false;
        }
        if (hasSet.contains(node.val)){
            return true;
        }
        hasSet.add(k - node.val);
        return helper(node.left, k, hasSet) || helper(node.right, k, hasSet);
    }
}
