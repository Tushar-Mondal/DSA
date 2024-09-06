package Trees.Questions;

import Trees.BinaryTree;

import java.util.*;

public class ZigzagLevelOrderTrav extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(Arrays.toString(new List[]{zigzagLevelOrder(root)}));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        boolean doRev = false;
        while (!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if(doRev){
                    TreeNode currentNode = deque.pollLast();
                    if(currentNode.right != null){
                        deque.offerFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        deque.offerFirst(currentNode.left);
                    }
                    currentLevel.add(currentNode.val);
                }else {
                    TreeNode currentNode = deque.poll();
                    if(currentNode.left != null){
                        deque.offer(currentNode.left);
                    }
                    if(currentNode.right != null){
                        deque.offer(currentNode.right);
                    }
                    currentLevel.add(currentNode.val);
                }
            }
            doRev = !doRev;
            result.add(currentLevel);
        }
        return result;
    }
}
