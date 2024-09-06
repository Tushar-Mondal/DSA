package Questions;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }
}

class MyQueue {
    Stack<Integer> f;
    Stack<Integer> s;

    public MyQueue (){
        f = new Stack<>();
        s = new Stack<>();
    }

    public void push(int x) {
        f.push(x);
    }

    public int pop() throws Exception {
        if (empty()){
            throw new Exception("The queue is empty");
        }
        while (!f.empty()){
            s.push(f.pop());
        }
        int pooped = s.pop();
        while (!s.empty()){
            f.push(s.pop());
        }
        return pooped;
    }

    public int peek() throws Exception{
        if (empty()){
            throw new Exception("The queue is empty");
        }
        while (!f.empty()){
            s.push(f.pop());
        }
        int peek = s.peek();
        while (!s.empty()){
            f.push(s.pop());
        }
        return peek;
    }

    public boolean empty() {
        return f.empty();
    }
}

class MyOwnQueue{
    Stack<Integer> f;
    Stack<Integer> s;

    public MyOwnQueue (){
        f = new Stack<>();
        s = new Stack<>();
    }

    public void push(int x) {
        while (!f.empty()){
            s.push(f.pop());
        }
        f.push(x);
        while (!s.empty()){
            f.push(s.pop());
        }
    }

    public int pop() throws Exception {
        if (empty()){
            throw new Exception("The queue is empty");
        }
        return f.pop();
    }

    public int peek() throws Exception{
        if (empty()){
            throw new Exception("The queue is empty");
        }
        return f.peek();
    }

    public boolean empty() {
        return f.empty();
    }
}
