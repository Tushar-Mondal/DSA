package Queue;

public class Dynamic_Dequeue extends Custom_Dequeue{
    public Dynamic_Dequeue() {
        super();
    }

    public Dynamic_Dequeue(int size) {
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
    public void addFirst(int element) throws Queue_Exception {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.addFirst(element);
    }

    @Override
    public int remove() throws Queue_Exception {
        return super.remove();
    }

    @Override
    public int removeLast() throws Queue_Exception {
        return super.removeLast();
    }
}
