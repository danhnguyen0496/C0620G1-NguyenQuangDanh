package bai_11_dsa_stack_queue.thuc_hanh.deployment_use_class_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public int size() {
        return stack.size();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
