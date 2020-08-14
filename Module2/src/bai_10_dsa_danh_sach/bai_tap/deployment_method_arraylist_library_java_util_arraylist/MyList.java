package bai_10_dsa_danh_sach.bai_tap.deployment_method_arraylist_library_java_util_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

//    public void add(int index, E element) {
//        elements = Arrays.copyOfRange(elements, 0, index);
//        System.out.println(Arrays.toString(elements));
//    }

//    public void ensureCapacity() {
//        if (size > elements.length) {
//            E[] newElement = ((E[]) new Object[size * 2 + 1]);
//            System.arraycopy(elements, 0, newElement, 0, newElement.length);
//            elements = newElement;
//        }
//    }

    public void add(int index, E element) {
        ensureCapacity(elements.length);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }


    public boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    public E remove(int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E>clone() {
        MyList<E> myList = new MyList<>();
        myList.elements = Arrays.copyOf(elements, size());
        return myList;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        if (size <= 0 || size >= elements.length) {
            return false;
        }
        elements[size] = element;
        size++;
        return true;
    }

    public E get(int index) {
        if (checkIndex(index)) {
            return (E) elements[index];
        }
        return null;
    }

    public E clear() {
        elements = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        return (E) elements;
    }
}
