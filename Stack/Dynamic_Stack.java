package Stack;

public class Dynamic_Stack extends Custom_Stack{
    public Dynamic_Stack() {
        super();// It will call Custom_Stack.
    }

    public Dynamic_Stack(int size) {
        super(size);// It will call Custom_Stack(size).
    }

    @Override
    public void push(int item) throws StackException {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.push(item);
    }

    @Override
    public int pop() throws StackException {
        return super.pop();
    }
}
