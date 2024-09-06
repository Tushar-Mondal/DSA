package Linked_List;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(tail == null){
            tail = head;
        }
        node.prev = tail;
        if(head != null){
            head.prev = node;
            node.next = head;
        }else {
            node.next = node;
        }
        head = node;
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
        node.next = head;
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
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = head;
        }else {
            head.prev = tail;
            tail.next = head;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        int value = tail.val;
        if(size <= 1){
            return deleteFirst();
        }
        tail = tail.prev;
        tail.next = head;
        size--;
        return value;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        int value = get(index).val;
        Node prev = get(index).prev;
        prev.next = get(index).next;
        size--;
        return value;
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
        for (int i = 0; i < size; i++) {
            System.out.print(" <=> " + temp.val);
            temp = temp.next;
        }
        System.out.println(" <=> END");
    }

    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){this.val = val;}
        public Node(int val, Node prev, Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}