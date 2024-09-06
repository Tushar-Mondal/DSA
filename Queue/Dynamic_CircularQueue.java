package Queue;

public class Dynamic_CircularQueue extends Custom_CircularQueue {
    public Dynamic_CircularQueue() {
        super();
    }

    public Dynamic_CircularQueue(int size) {
        super(size);
    }

    @Override
    public void add(int element) throws Queue_Exception {
        if (isFull()){
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = data[(f + i) % size];
            }
            f = 0;
            end = size;
            data = temp;
        }
        super.add(element);
    }

    @Override
    public int remove() throws Queue_Exception {
        return super.remove();
    }
}
