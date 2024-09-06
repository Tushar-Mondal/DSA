package Queue;

public class Custom_Dequeue extends Custom_Queue {
    public Custom_Dequeue() {
        super();
    }

    public Custom_Dequeue(int size) {
        super(size);
    }

    @Override
    public void add(int element) throws Queue_Exception {
        super.add(element);
    }

    public void addFirst (int element) throws Queue_Exception {
        if(this.isFull()){
            throw new Queue_Exception("The queue is Full!!");
        }
        for (int i = end++; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = element;
    }

    @Override
    public int remove() throws Queue_Exception {
        return super.remove();
    }

    public int removeLast () throws Queue_Exception{
        if (this.isEmpty()){
            throw new Queue_Exception("The queue is Empty!!");
        }
        return data[--end];
    }
}
