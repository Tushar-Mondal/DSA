package Queue;

public class Custom_Queue {
    public int[] data;
    public static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Custom_Queue() {
        this(DEFAULT_SIZE);
    }

    public Custom_Queue(int size) {
        this.data = new int[size];
    }

    public void add (int element) throws Queue_Exception{
        if (isFull()){
            throw new Queue_Exception("The queue is Full!!");
        }
        data[end++] = element;
    }

    public int remove () throws Queue_Exception{
        if (isEmpty()){
            throw new Queue_Exception("The queue is Empty!!");
        }
        int item = data[0];
        System.arraycopy(data, 1, data, 0, end--);
        return item;
    }

    public boolean isEmpty (){
        return end == 0;
    }

    public boolean isFull (){
        return end == data.length;
    }
}