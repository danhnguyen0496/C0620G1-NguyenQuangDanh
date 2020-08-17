package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;


public class MyLinkedListModule<E> {
    private Node head;
    private Node tail;
    private int numNode = 0;

     class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public MyLinkedListModule() {
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void add(int index, E element) {
        numNode++;
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp != tail; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
    }

    public void addFirst(E e) {
        numNode++;
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        if (numNode == 1) tail = head;
    }

    public void addLast(E e) {
        if (numNode == 1) tail = head;
        numNode++;
        Node temp = new Node(e);
        tail.next = temp;
        tail = temp;
    }

    public void remove(int index) {
        if (numNode == 1) tail = head;
        if (index == 0) {
            throw new UnsupportedOperationException("Use removeFirst()");
        }
        numNode--;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public boolean remove(Object e) {
        if (numNode == 1) tail = head;
        Node temp;
        temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.next.equals(e)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNode;
    }

    public MyLinkedListModule<E> clone() {
        MyLinkedListModule<E> newLinkedList = new MyLinkedListModule<>();
        Node temp = head;
        newLinkedList.addFirst((E) temp.getData());
        temp = temp.next;
        for (int i = 1; i < numNode; i++) {
            newLinkedList.addLast((E) temp.getData());
            temp = temp.next;
        }
        return newLinkedList;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData() == o) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData() == o) return i;
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst() {
        return (E) head;
    }

    public E getLast() {
        return (E) tail;
    }

    public void clear() {
        head = null;
        tail = null;
        numNode = 0;
    }

    @Override
        public String toString() {
            String str = "[";
            Node temp = head;
            for (int i = 0; i < numNode - 1; i++) {
                str += temp + ", ";
                temp = temp.next;
            }
            str += tail + "]";
            return str;

//        return "MyLinkedList{" +
//                "head=" + head +
//                ", numNode=" + numNode +
//                '}';
    }
}

