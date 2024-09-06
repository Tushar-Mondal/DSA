package Linked_List.Questions;

import Linked_List.LL;

public class MiddleOfList {
    public static void main(String[] args) {
        LL node = new LL();
        node.insertLast(4);
        node.insertLast(2);
        node.insertLast(1);
        node.insertLast(3);
        node.insertLast(5);
        node.display();

       LL.Node node1 = getMid(node.head);
        System.out.print("START");
        while (node1 != null){
            System.out.print(STR." -> \{node1.value}");
            node1 = node1.next;
        }
        System.out.print(" -> END");
    }

    public static LL.Node middleNode(LL.Node head){
        LL.Node slow = head;
        LL.Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }

    public static LL.Node getMid(LL.Node head){
        LL.Node midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        return midPrev.next;
    }
}
