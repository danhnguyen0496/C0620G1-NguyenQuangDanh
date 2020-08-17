package bai_10_dsa_danh_sach.bai_tap.deployment_method_arraylist_library_java_util_arraylist;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<Integer>(10);

        // Test add
        integerMyList.add(0, 10);
        integerMyList.add(1, 20);
        integerMyList.add(2, 30);
        System.out.println(integerMyList.get(0));
        System.out.println(integerMyList.get(1));
        System.out.println(integerMyList.get(2));
        System.out.println(integerMyList.get(50));

//        // Test checkIndex
//        System.out.println(integerMyList.checkIndex(2));
//        System.out.println(integerMyList.checkIndex(50));
//
//        // Test remove
//        System.out.println(integerMyList.remove(2));
//        System.out.println(integerMyList.toString());
//
//        // Test size
//        System.out.println(integerMyList.size());
//
//
//        // Test contains
//        System.out.println(integerMyList.contains(10));
//
//        // Test indexOf
//        System.out.println(integerMyList.indexOf(20));
//
//        // Test add ( E element)
//        System.out.println(integerMyList.add(100));
//
//        // Test get (int index)
//        System.out.println(integerMyList.get(12));
//
//        // Test clone
//        integerMyList.clone();
//        System.out.println(integerMyList);
//
//        // Test clear
//        integerMyList.clear();
//        System.out.println(integerMyList);


    }
}

