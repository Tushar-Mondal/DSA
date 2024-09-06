package Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        Custom_Stack stack = new Dynamic_Stack(5);
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(55);
        stack.push(57);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
