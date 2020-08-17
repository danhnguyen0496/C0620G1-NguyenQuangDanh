package bai_11_dsa_stack_queue.thuc_hanh.optional_deployment_stack_use_array;

public class MyStackOptional {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStackOptional(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        } else {
            arr[index] = element;
            index++;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        } else {
            return arr[--index];
        }
    }
    public int size() {
        return index;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
}
