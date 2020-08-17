package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        // test addFirst
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        System.out.println(myLinkedList);

        // test addLast
//        myLinkedList.addLast(3);
//        myLinkedList.addLast(4);

        // test add
        myLinkedList.add(1, 22);
        myLinkedList.add(3, 44);
        System.out.println(myLinkedList);

        // test removeFirst
        myLinkedList.removeFirst();
        System.out.println(myLinkedList);

        // test removeLast
        myLinkedList.removeLast();
        System.out.println(myLinkedList);

        // test remove (int index)
        myLinkedList.remove(2);
        System.out.println(myLinkedList);

        // test remove (E element)
//        myLinkedList.remove;
//        System.out.println(myLinkedList);

        // test get(index)
//        myLinkedList.get(1);
//        System.out.println(myLinkedList);

        // test getFirst
//        myLinkedList.getFirst();
//        System.out.println(myLinkedList);

        // test getLast
//        myLinkedList.getLast();
//        System.out.println(myLinkedList);

        // test size
        myLinkedList.size();
        System.out.println(myLinkedList.size());

        // test printList
        myLinkedList.printList();

        // test clone
        myLinkedList.clone();
        System.out.println(myLinkedList.clone());
    }
}
