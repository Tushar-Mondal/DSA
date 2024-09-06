//package Questions;
//
//import java.util.Stack;
////1541.
//public class BalParString {
//    public static void main(String[] args) {
//
//    }
//    public int minInsertions(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()){
//            if(ch == ')'){
//                if (!stack.isEmpty() && stack.peek() == '('){
//                    stack.pop();
//                }else {
//                    stack.push(ch);
//                }
//            }else {
//                stack.push(ch);
//            }
//        }
//        return stack.size();
//    }
//}
//Unsolved.
