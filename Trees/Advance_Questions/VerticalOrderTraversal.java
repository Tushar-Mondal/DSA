package Trees.Advance_Questions;

import Trees.BinaryTree;

import java.util.*;

// 987
public class VerticalOrderTraversal extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(Arrays.toString(new List[]{verticalTraversal(root)}));
    }
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        TreeMap <Integer, List<nodal>> treeMap = new TreeMap<>();
        helper (root,0, 0, treeMap);
        for (List<nodal> nodals : treeMap.values()){
            List<nodal> list = new ArrayList<>();
            for (nodal nodal : nodals){
                list.add(nodal);
            }
            ans.add(sort(list));
        }
        return ans;
    }
    public static void helper (TreeNode node,int row, int col, TreeMap <Integer, List<nodal>> treeMap){
        if (node == null){
            return;
        }
        helper(node.left, row + 1, col - 1, treeMap);
        if (treeMap.containsKey(col)){
            treeMap.get(col).add(new nodal(row, node.val));
        }else {
            treeMap.put(col, new ArrayList<>());
            treeMap.get(col).add(new nodal(row, node.val));
        }
        helper(node.right, row + 1, col + 1, treeMap);
    }
    public static class nodal {
        Integer row;
        Integer value;

        public nodal(Integer row, Integer value) {
            this.row = row;
            this.value = value;
        }
    }
    public static List<Integer> sort (List<nodal> list){
        List<Integer> list1 = new ArrayList<>();
        Integer min = list.get(0).row;
        list1.add(list.get(0).value);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i).row){
                list1.add(0, list.get(i).value);
                min = list.get(i).row;
            }else {
                list1.add(list.get(i).value);
            }
        }
        Collections.sort(list1.subList(1, list1.size()));
        return list1;
    }
}
