package Trees.Questions;

import Trees.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// Future brother It's not a joke for me if you try to optimize more you are welcome qno is 297.
public class SerializeAndDeserializeBinaryTree extends BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-13);
        root.left.left = new TreeNode(-6);
        root.left.right = new TreeNode(-7);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String ans = serialize(root);
        System.out.println(ans);
        BinaryTree tree = new BinaryTree();
        tree.root = deserialize(ans);
        tree.prettyDisplay();
    }
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helpers(root, list);
        return list.toString().trim();
    }

    private static void helpers(TreeNode node, List<String> list) {
        if(node == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helpers(node.left, list);
        helpers(node.right, list);
    }

    //     Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        List<String> str = new ArrayList<>(Arrays.asList(data.split(",")));
        Collections.reverse(str);
        return helperd(str);
    }
    private static TreeNode helperd (List<String> data){
        String val = data.remove(data.size() - 1);
        if(val.charAt(0) == 'n'){
            return null;
        }
        if(val.charAt(0) == '[' || val.charAt(0) == ']' || val.charAt(0) == ' '){
            val = String.copyValueOf(val.toCharArray(), 1, val.length() - 1);
        }
        if(!val.equals("null]") && !val.equals("null")){
            TreeNode node = new TreeNode(Integer.parseInt(val));

            node.left = helperd(data);
            node.right = helperd(data);

            return node;
        }
        return null;
    }
}
