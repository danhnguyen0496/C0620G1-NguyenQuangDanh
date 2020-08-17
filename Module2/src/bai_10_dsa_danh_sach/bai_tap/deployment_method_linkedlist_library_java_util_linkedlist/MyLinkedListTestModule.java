package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedListTestModule {
    public static void main(String[] args) {
        MyLinkedListModule<Integer> integerMyLinkedListModule = new MyLinkedListModule<Integer>();

        // Test addFirst
        integerMyLinkedListModule.addFirst(4);
        integerMyLinkedListModule.addFirst(5);
        integerMyLinkedListModule.addFirst(6);
        System.out.println(integerMyLinkedListModule);


        // Test addLast
        integerMyLinkedListModule.addLast(7);
        integerMyLinkedListModule.addLast(8);
        integerMyLinkedListModule.addLast(9);
        System.out.println(integerMyLinkedListModule);

        // Test add
        integerMyLinkedListModule.add(2,22);
        integerMyLinkedListModule.add(4,44);
        integerMyLinkedListModule.add(6,66);
        System.out.println(integerMyLinkedListModule);

        // Test remove
        integerMyLinkedListModule.remove(3);
        System.out.println(integerMyLinkedListModule);




    }
}
