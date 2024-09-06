package Linked_List;

public class DLL {
    private Node head;
    private Node tail;

    private int size;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val, get(index), get(index).prev);
        node.next = get(index);
        node.prev = get(index).prev;
        get(index).prev.next = node;
        get(index).prev = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }else {
            head.prev = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        if(size <= 1){
            return deleteFirst();
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        int val = get(index).value;
        Node prev = get(index - 1);
        prev.next = get(index).next;
        size--;
        return val;
    }

    public Node get(int index){
        if(index < (size - 1)/2){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }else {
            Node node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    public void display(){
        Node temp = head;
        System.out.print("START");
        while (temp != null){
            System.out.print(" <=> " + temp.value);
            temp = temp.next;
        }
        System.out.println(" <=> END");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
