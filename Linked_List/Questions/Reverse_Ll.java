package Linked_List.Questions;

import Linked_List.LL;

import static Linked_List.Questions.MiddleOfList.middleNode;
import static Linked_List.Questions.Recursion_Reverse.reverse;

public class Reverse_Ll {
    public static LL.Node reverse_Particular(LL.Node head, int left, int right){
        if(left == right){
            return head;
        }
        LL.Node current = head;
        LL.Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        LL.Node last = prev;
        LL.Node newEnd = current;
        LL.Node next = current.next;

        // Reverse between left and right.
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    public boolean isPalindrome(LL.Node head) {
        LL.Node mid = middleNode(head);
        LL.Node secondHead = reverse(mid);
        // compare both the halves.
        while (head != mid || secondHead != null){
            if(head.value != secondHead.value){
                return false;
            }else {
                if(head.next == mid && secondHead.next == null){
                    return true;
                }else {
                    head = head.next;
                    secondHead = secondHead.next;
                }
            }
        }
        return true;
    }
}
