package Queue;


import java.util.LinkedList;
import java.util.Queue;

public abstract class Queuee {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(2);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.remove());
    }
}
