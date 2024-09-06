package Linked_List.Questions;

import Linked_List.LL;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.display();

        LL ans = merge(first, second);
        ans.display();
    }
    public static LL merge(LL first, LL second){
        LL.Node f = first.head;
        LL.Node s = second.head;

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
        return ans;
    }
}
