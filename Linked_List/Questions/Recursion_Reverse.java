package Linked_List.Questions;

import Linked_List.LL;

import static Linked_List.LL.size;
import static Linked_List.LL.tail;

public class Recursion_Reverse {
    public static void reversal(LL.Node node){
        if(node == tail){
            LL.Node head = node;
        }
        reversal(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public static LL.Node reverse(LL.Node head){
        if(size < 2){
            return head;
        }
        LL.Node prev = null;
        LL.Node pres = head;
        LL.Node next = pres.next;
        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
