package Stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(55);
        stack.push(57);

        int remove = stack.pop();
        System.out.println(remove);
        System.out.println(stack);
    }
}
