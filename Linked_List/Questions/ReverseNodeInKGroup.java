package Linked_List.Questions;

import Linked_List.LL;
// Hard level question 25.

public class ReverseNodeInKGroup {
    public static void main(String[] args) {
        LL x  = new LL();
        x.insertLast(1);
        x.insertLast(2);
        x.insertLast(3);
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
        LL.Node x1 = reverseKGroup(x.head, 2);
        System.out.print("START");
        while (x1 != null){
            System.out.printf(" -> %d", x1.value);
            x1 = x1.next;
        }
        System.out.print(" -> END");
    }
    public static LL.Node reverseKGroup(LL.Node head, int k) {
        int size = size(head);
        if(head == null || head.next == null || k < 2){
            return head;
        }
        if(size == k){
            return reverse(head, k, null);
        }
        if(size > k){
            LL.Node temp = null;
            if(k * 2 > size){
                return reverse(head, k, node(head, k));
            }
            for(int i = k; i <= size; i += k){
                if(i == k){
                    temp = reverse(head, k, node(head, i));
                    i += k;
                }else{
                    node(temp, i - k - 1).next = reverse(node(temp, i - k), k, node(temp, i));
                    i += k;
                }
            }
            return temp;
        }
        return head;
    }
    public static int size(LL.Node head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    public static LL.Node reverse(LL.Node head, int k, LL.Node node){
        LL.Node prev = node;
        LL.Node pres = head;
        LL.Node next = pres.next;
        for (int i = 0; i < k; i++){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public static LL.Node node(LL.Node node, int k){
        for(int i = 0; i < k; i++){
            node = node.next;
        }
        return node;
    }
}
