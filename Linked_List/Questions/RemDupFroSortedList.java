package Linked_List.Questions;

import Linked_List.LL;

public class RemDupFroSortedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.display();

        duplicates(list.head);
        list.display();
    }
    public static void duplicates(LL.Node head){
        LL.Node node = head;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                LL.size--;
            }else {
                node = node.next;
            }
        }
        LL.tail.next = null;
        LL.tail = node;
    }
}
