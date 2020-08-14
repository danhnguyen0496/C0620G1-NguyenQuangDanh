package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedTest {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(3);
        System.out.println(myLinkedList);

        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        System.out.println(myLinkedList);

        myLinkedList.add(1, 4);
        myLinkedList.add(3, 1);
        System.out.println(myLinkedList);

        myLinkedList.remove(2);
        System.out.println(myLinkedList);


        System.out.println(myLinkedList.contains(9));
        System.out.println(myLinkedList.contains(3));

        System.out.println(myLinkedList.indexOf(4));
        System.out.println(myLinkedList.indexOf(2));


    }

}

