package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int numNode = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Object getData() {
            return data;
        }

        public Node(Object data) {
            this.data = data;
        }
    }

    public void add(int index, Object element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;

//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//        numNode++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNode++;
    }

    public Object removeFirst() {
        if (numNode == 0) return null;
        else {
            Node temp = head;
            head = temp.next;
            numNode--;
            if (head == null) tail = null;
            return temp.data;
        }
    }

    public Object removeLast() {
        if (numNode == 0) return null;
        else if (numNode == 1) {
            Node temp = head;
            head = tail = null;
            numNode = 0;
            return temp.data;
        } else {
            Node current = head;
            for (int i = 0; i < numNode - 2; i++) {
                current = current.next;
            }
            Node temp = tail;
            temp = current;
            tail.next = null;
            numNode--;
            return temp.data;
        }
    }


    public Object remove(int index) {
        if (index < 0 || index >= numNode) return null;
        else if (index == 0) return removeFirst();
        else if (index == numNode - 1) return removeLast();
        else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            numNode--;
            return current.data;
        }
    }

    public int size() {
        return numNode;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getFirst() {
        Node temp = head;
        return temp.data;
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            temp.next = null;
        }
    }

    public int indexOf(Object data) {
        head = new Node(data);
        for (int i = 0; i < numNode; i++) {
            if (data.equals(())) {

            }
        }


    }
}
