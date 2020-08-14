package bai_10_dsa_danh_sach.bai_tap.deployment_method_arraylist_library_java_util_arraylist;

import java.util.Arrays;

public class MyListModule<E> {
    private static int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyListModule() {
    }

    public MyListModule(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size + 1) {
            throw new IndexOutOfBoundsException();
        }
        size++;
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }

    public int size() {
        return size;
    }

    public MyListModule<E> clone() {
        MyListModule<E> newMyListModule = new MyListModule<>();
        newMyListModule.elements = Arrays.copyOf(elements, size());
        return newMyListModule;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(o)) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(o)) return i;
        }
        return -1;
    }

    public boolean add(E e) {
        if (indexOf(e) == -1) {
            add(size(), e);
            return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        elements = null;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
