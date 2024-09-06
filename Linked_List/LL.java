package Linked_List;

public class LL {
    public Node head;
    public static Node tail;

    public static int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
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
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //Insert Using Recursion.
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1,node.next);
        return node;
    }

    public void deleteRec(int index){
        head = deleteRec(index, head);
    }

    private Node deleteRec(int index, Node node){
        if(index == 0){
            size--;
            return node.next;
        }
        node.next = deleteRec(index - 1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return val;
    }

    public int deleteLast(){
       if(size <= 1){
           return deleteFirst();
       }
       int val = tail.value;
       tail = get(size - 2);
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

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null){
            System.out.print(STR."\{temp.value} -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static int getSize(Node head){
        int ans = 0;
        while (head != null){
            ans++;
            head = head.next;
        }
        return ans;
    }

    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
