package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedTest {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(8);
        System.out.println(myLinkedList);

        myLinkedList.addLast(10);
        myLinkedList.addLast(12);
        System.out.println(myLinkedList);

        myLinkedList.add(3, 2);
        myLinkedList.add(2, 9);
        System.out.println(myLinkedList);

        myLinkedList.remove(3);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.contains(10));
        System.out.println(myLinkedList.contains(7));

        System.out.println(myLinkedList.indexOf(6));
        System.out.println(myLinkedList.indexOf(9));
    }
}

