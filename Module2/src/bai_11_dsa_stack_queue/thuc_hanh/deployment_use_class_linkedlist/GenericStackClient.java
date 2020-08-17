package bai_11_dsa_stack_queue.thuc_hanh.deployment_use_class_linkedlist;

import java.util.Arrays;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of string: ");
        stackOfStrings();
        System.out.println("2. Stack of integers: ");
        stackOfIntegers();
    }

    private static void stackOfStrings() {
        MyGenericStack<String> stringMyGenericStack = new MyGenericStack<String>();
        stringMyGenericStack.push("Five");
        stringMyGenericStack.push("Four");
        stringMyGenericStack.push("Three");
        stringMyGenericStack.push("Two");
        stringMyGenericStack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stringMyGenericStack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!stringMyGenericStack.isEmpty()) {
            System.out.println((stringMyGenericStack).pop());
        }
        System.out.println("1.3. Size of stack after pop operations : " + stringMyGenericStack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> integerMyGenericStack = new MyGenericStack<Integer>();
        integerMyGenericStack.push(5);
        integerMyGenericStack.push(4);
        integerMyGenericStack.push(3);
        integerMyGenericStack.push(2);
        integerMyGenericStack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + integerMyGenericStack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!integerMyGenericStack.isEmpty()) {
            System.out.println(integerMyGenericStack.pop());
        }
        System.out.println("2.3 Size of stack after pop operations : " + integerMyGenericStack.size());
    }
}
