package Linked_List.Questions;

import Linked_List.LL;

public class LinkedListCycle {
    public static void main(String[] args) {
        //Enter any looped Linked List.

    }
    public static boolean hasCycle(LL.Node head){
        LL.Node fast = head;
        LL.Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static int Cycle_Length(LL.Node head){
        int count = 0;
        LL.Node fast = head;
        LL.Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               do {
                   slow = slow.next;
                   count++;
               } while (slow != fast);
                break;
            }
        }
        return count;
    }
    public static LL.Node startCycle(LL.Node head){
        int length = Cycle_Length(head);
        if(length == 0){
            return null;
        }
        //Find the start Node.
        LL.Node f = head;
        LL.Node s = head;
        while (length != 0){
            s = s.next;
            length--;
        }
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
}
