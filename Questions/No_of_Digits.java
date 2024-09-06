package Questions;

import Linked_List.LL;

public class No_of_Digits {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int n = in.nextInt();
//        System.out.print("Enter the base:");
//        int base = in.nextInt();
//        int digits = (int)((Math.log(n) / Math.log(base)) + 1);
//        System.out.printf("The no. of digits is %d",digits);
        LL x = new LL();
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.insertFirst(9);
        x.display();
        LL y = new LL();
        y.insertFirst(9);
        y.insertFirst(9);
        y.insertFirst(9);
        y.insertFirst(9);
        y.display();
        y.head = addTwoNumbers(x.head, y.head);
        y.display();
    }
    public static LL.Node addTwoNumbers(LL.Node l1, LL.Node l2) {
        LL.Node ans = l1;
        int k = 0;
        while (l1 != null && l2 != null) {
            k += l1.value + l2.value;
            if (digit(k) == 2) {
                l1.value = k % 10;
                k /= 10;
                if (l1.next == null && k != 0) {
                    if(l2.next != null){
                        l1.next = l2.next;
                        break;
                    }else {
                        l1.next = new LL.Node(k, null);
                        return ans;
                    }
                }
            } else {
                l1.value = k;
                k = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            if(l1.next != null && l1.value != 0){
                l1 = l1.next;
            }
            while (k != 0) {
                if (digit(k) == 2) {
                    k += l1.value;
                    l1.value = k % 10;
                    k /= 10;
                    if (l1.next == null && k != 0) {
                        l1.next = new LL.Node(k, null);
                        return ans;
                    }
                } else {
                    l1.value = k;
                    k = 0;
                }
                l1 = l1.next;
            }
        }
        return ans;
    }
    public static int digit ( int num){
        return (int) ((Math.log(num) / Math.log(10)) + 1);
    }
}
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */