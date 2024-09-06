package Queue;

public class Dynamic_Queue extends Custom_Queue {
    public Dynamic_Queue() {
        super();
    }

    public Dynamic_Queue(int size) {
        super(size);
    }

    @Override
    public void add(int element) throws Queue_Exception {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.add(element);
    }

    @Override
    public int remove() throws Queue_Exception {
        return super.remove();
    }
}
