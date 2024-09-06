package Linked_List.Questions;

import Linked_List.LL;

import static Linked_List.LL.getSize;

public class SortList_BubbleSort {
    static LL node = new LL();
    public static void main(String[] args) {
        node.insertLast(4);
        node.insertLast(2);
        node.insertLast(1);
        node.insertLast(3);
        node.insertLast(0);
        node.insertLast(5);
        node.display();

        LL.Node ans = sortList(node.head);
        System.out.print("START");
        while (ans != null){
            System.out.print(" -> " + ans.value);
            ans = ans.next;
        }
        System.out.print(" -> END");
    }

    public static LL.Node sortList(LL.Node head) {
        if(head == null){
            return head;
        } else {
            return BubbleSort(head, getSize(head) - 1, 0);
        }
    }

    public static LL.Node BubbleSort(LL.Node head, int row, int col) {
        if (row == 0) {
            return head;
        }
        if (row > col) {
            LL.Node f = get(col, head);
            LL.Node s = get(col + 1, head);
            if (f.value > s.value) {
                // Swap
                if (f == head) {
                    head = s;
                    f.next = s.next;
                    s.next = f;
                } else if ((s.next == null)) {
                    LL.Node prev = get(col - 1, head);
                    prev.next = s;
                    s.next = f;
                    f.next = null;
                } else {
                    LL.Node prev = get(col - 1, head);
                    prev.next = s;
                    f.next = s.next;
                    s.next = f;
                }
            }
            return BubbleSort(head, row, col + 1);
        }else {
            return BubbleSort(head, row - 1, 0);
        }
    }
    public static LL.Node get(int index, LL.Node head){
        if(getSize(head) > 100){
            if(index % 2 == 0){
                for (int i = 0; i <= index / 2; i++) {
                    head = head.next.next;
                }
                return head;
            } else{
                for (int i = 0; i < index / 2; i++) {
                    head = head.next.next;
                }
                return head;
            }
        }else {
            for (int i = 0; i < index; i++) {
                head = head.next;
            }
            return head;
        }
    }
}