package Stack;

public class Custom_Stack {
    public int[] data;
    public static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Custom_Stack (){
        this(DEFAULT_SIZE);
    }

    public Custom_Stack (int size){
        this.data = new int[size];
    }

    public void push (int item) throws StackException{
        if(isFull()){
            throw new StackException("The Stack is Full!!");
        }
        ptr++;
        data[ptr] = item;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("The Stack is Empty!!");
        }
        return data[ptr--];
    }

    public int peak () throws StackException {
        if(isEmpty()){
            throw new StackException("Can't find peak the Stack is Empty!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
