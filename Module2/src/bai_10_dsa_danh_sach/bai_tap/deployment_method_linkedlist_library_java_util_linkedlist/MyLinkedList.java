package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {

    }

    private class Node {
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

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        if (tail == null) tail = head;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = tail;
        tail = new Node(element);
        tail.next = temp;
        tail = temp;
        if (tail == null) tail = head;
        numNodes++;
    }

    public E removeFirst() {
        if (numNodes <= 0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if (head == null) tail = null;
            return (E) temp.getData();
        }
    }

    public E removeLast() {
        if (numNodes <= 0) return null;
        else if (numNodes == 1) {
            Node temp1 = head;
            head = tail = null;
            numNodes = 0;
            return (E) temp1.getData();
        } else {
            Node temp2 = head;
            for (int i = 1; i < numNodes; i++) {
                temp2 = temp2.next;
            }
            Node temp = tail;
            tail = temp2;
            tail.next = null;
            numNodes--;
            return (E) temp.getData();
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;
        else if (index == numNodes - 1) return removeLast();
        else if (index == 0) return removeFirst();
        else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numNodes--;
            return (E) temp.getData();
        }
    }

    public boolean remove(E element) {
        if (numNodes == 1) head = tail;
        Node temp;
        temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.next.equals(element)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = tail.next;
        }
        return false;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head;
    }

    public E getLast() {
        return (E) tail;

//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        return (E) temp.data;
    }

    public int size() {
        return this.numNodes;
    }

    public void printList() {
        Node temp = head;
        for (int i = 1; i <= numNodes; i++) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
//        while (temp.next != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> myLinkedList = new MyLinkedList<E>();
        Node temp = head;
        myLinkedList.addFirst((E) temp.getData());
        temp = temp.next;
        while (temp != null) {
            temp = temp.next;
        }
        return myLinkedList;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 1; i <= numNodes; i++) {
            temp = temp.next;
            if (o.equals(temp.getData())) ;
            return true;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 1; i <= numNodes; i++) {
            temp = temp.next;
            if (o.equals(temp.getData())) ;
            return i;
        }
        return -1;
    }

    public String toString() {
        Node temp = head;
        String str = "";
        for (int i = 1; i < numNodes; i++) {
            str += temp + ", ";
            temp = temp.next;
        }
        str += tail;
        return str;
    }
}

