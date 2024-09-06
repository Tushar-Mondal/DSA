package Heaps;

import Trees.BinaryTree;

import java.util.PriorityQueue;

public class KthSmallestElementInBST extends BinaryTree {
    public static int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper (root, k, minHeap);
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (!minHeap.isEmpty()){
                ans = minHeap.poll();
            }
        }
        return ans;
    }
    public static void helper (TreeNode node, int k, PriorityQueue<Integer> minHeap){
        if (node == null){
            return;
        }
        helper(node.left, k, minHeap);
        minHeap.offer(node.val);
        helper(node.right, k, minHeap);
    }
}
