package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.addLast(78);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
    }
}
