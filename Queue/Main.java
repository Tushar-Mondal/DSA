package Queue;

public class Main {
    public static void main(String[] args) throws Queue_Exception {
        Custom_CircularQueue queue = new Dynamic_CircularQueue(5);
        queue.add(1);
        queue.add(5);
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(150);
        queue.display();
        System.out.println(queue.remove());
        queue.add(1);
        queue.display();
//        queue.addFirst(2);
//        queue.addFirst(10);
//        queue.addFirst(19);
//        queue.add(51);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.removeLast());
//        System.out.println(queue.removeLast());
//        System.out.println(queue.removeLast());
    }
}
