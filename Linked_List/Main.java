package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.insert(10, 5);
        list.display();

        list.insertRec(88, 2);
        list.display();

        list.deleteRec(7);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        System.out.println(list.find(100));

        DLL list2 = new DLL();
        list2.insertFirst(14);
        list2.insertFirst(12);
        list2.insertFirst(18);
        list2.insertFirst(15);
        list2.insertFirst(19);
        list2.display();

        list2.insertLast(50);
        list2.display();

        list2.insert(3, 1);
        list2.display();

        list2.insert(16, 4);
        list2.display();

        System.out.println(list2.deleteFirst());
        list2.display();

        System.out.println(list2.deleteLast());
        list2.display();

        System.out.println(list2.delete(2));
        list2.display();

        CLL list3 = new CLL();
        list3.insertFirst(20);
        list3.insertFirst(29);
        list3.insertFirst(22);
        list3.insertFirst(27);
        list3.insertFirst(21);
        list3.display();

        list3.insertLast(3);
        list3.display();

        list3.insert(28, 5);
        list3.display();

        System.out.println(list3.deleteFirst());
        list3.display();

        System.out.println(list3.deleteLast());
        list3.display();

        System.out.println(list3.delete(2));
        list3.display();
    }
}
