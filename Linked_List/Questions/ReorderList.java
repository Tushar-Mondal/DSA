package Linked_List.Questions;

import Linked_List.LL;

import static Linked_List.Questions.MiddleOfList.middleNode;
import static Linked_List.Questions.Recursion_Reverse.reverse;

public class ReorderList {
    public static void main(String[] args) {
        LL x = new LL();
        x.insertLast(1);
        x.insertLast(2);
        x.insertLast(3);
        x.insertLast(4);
        x.display();
        LL.Node y = x.head;
        LL.Node z = reorderList(y);
        System.out.print("START");
        while (z != null){
            System.out.printf(" ->  %d", z.value);
            z = z.next;
        }
        System.out.println(" -> END");
    }
    public static LL.Node reorderList(LL.Node head) {
        if(head == null || head.next == null){
            return head;
        }
        LL.Node mid = middleNode(head);
        LL.Node secondHead = reverse(mid);
        LL.Node h = head;
        while (h != null && secondHead != null){
            LL.Node temp = h.next;
            h.next = secondHead;
            h = temp;
            temp = secondHead.next;
            secondHead.next = h;
            secondHead = temp;
        }
        if(h != null){
            h.next = null;
        }
        return head;
    }
}
