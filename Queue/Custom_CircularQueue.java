package Queue;

public class Custom_CircularQueue extends Custom_Queue{
    int f = 0;
    int size = 0;
    public Custom_CircularQueue() {
        super();
    }

    public Custom_CircularQueue(int size) {
        super(size);
    }

    @Override
    public void add(int element) throws Queue_Exception {
        if (this.isFull()){
            throw new Queue_Exception("The queue is Full!!");
        }
        data[end++] = element;
        end %= data.length;
        size++;
    }

    @Override
    public int remove() throws Queue_Exception {
        if (this.isEmpty()){
            throw new Queue_Exception("The queue is Empty!!");
        }
        size--;
        int removed = data[f++];
        f %= data.length;
        return removed;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    public void display (){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = f;
        do {
            System.out.print(STR."\{data[i++]} <- ");
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
