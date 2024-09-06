package Linked_List.Questions;

import Linked_List.LL;
// Question number 148.
public class SortList_MergeSort {
    public static void main(String[] args) {
        LL node = new LL();
        node.insertLast(4);
        node.insertLast(2);
        node.insertLast(1);
        node.insertLast(3);
        node.insertLast(5);
        node.display();

        LL.Node ans = sortList(node.head);

        System.out.print("START ");
        while (ans != null){
            System.out.print(" -> " + ans.value);
            ans = ans.next;
        }
        System.out.print(" -> END");
    }
    public static LL.Node sortList(LL.Node head){
        if(head == null || head.next == null){
            return head;
        }
        LL.Node mid = getMid(head);
        LL.Node left = sortList(head);
        LL.Node right = sortList(mid);
        return merge(left, right);
    }
    public static LL.Node getMid(LL.Node head){
        LL.Node midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        return midPrev.next;
    }
    public static LL.Node merge(LL.Node first, LL.Node second){
        LL.Node f = first;
        LL.Node s = second;

        LL ans = new LL();
        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans.head;
    }
}
