package Linked_List.Questions;

import Linked_List.LL;

public class RotateList {
    public static void main(String[] args) {
        LL x  = new LL();
//        x.insertLast(0);
        x.insertLast(1);
        x.insertLast(0);
        x.insertLast(1);
        x.insertLast(4);
        x.insertLast(5);
        x.insertLast(6);
        x.insertLast(7);
        x.insertLast(8);
        x.insertLast(9);
        x.insertLast(10);
        x.insertLast(11);
        x.insertLast(12);
        x.insertLast(13);
        x.insertLast(14);
        x.insertLast(15);
        x.insertLast(16);
        x.insertLast(17);
        x.insertLast(18);
        x.insertLast(19);
        x.insertLast(20);
        LL.Node x1 = rotateRight(x.head, 2);
        System.out.print("START");
        while (x1 != null){
            System.out.printf(" -> %d", x1.value);
            x1 = x1.next;
        }
        System.out.print(" -> END");
    }
    public static LL.Node rotateRight(LL.Node head, int k) {
        int size = size(head);
        if(head == null || head.next == null || k < 1 || k % size == 0){
            return head;
        }
        node(head, size - 1).next = head;
        if(k > size){
            head = node(head, size - 1 - (k % size)).next;
            node(head, size - 1).next = null;
        }else {
            head = node(head, size - 1 - k).next;
            node(head, size - 1).next = null;
        }
        return head;
    }
    public static LL.Node node(LL.Node node, int k){
        for (int i = 0; i < k; i++) {
            node = node.next;
        }
        return node;
    }
    public static int size(LL.Node node){
        int size = 0;
        while (node != null){
            size++;
            node = node.next;
        }
        return size;
    }
}
