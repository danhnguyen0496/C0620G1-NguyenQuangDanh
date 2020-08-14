/*package bai_10_dsa_danh_sach.bai_tap.deployment_method_linkedlist_library_java_util_linkedlist;

import bai_10_dsa_danh_sach.bai_tap.deployment_method_arraylist_library_java_util_arraylist.MyList;

public class MyLinkedList1 {
    private Node head;
    private Node tail;
    private int numNode = 0;

    public MyLinkedList1() {
    }

    public MyLinkedList1(Object data) {
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
    }*/

    // 10,20,....,30,50
    // 40 = new Node (40)
    // 20.next = 40;
    // holder = 30.next = 30,50
    // 40.next = holder
    /// 10.next =20; 20.next = 40; 40.next =30; 30.next =50
/*
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
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNode++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
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

    public static void main(String[] args) {
        MyLinkedList1 integerMyList = new MyLinkedList1(10);

        // Test add
        integerMyList.add(0, 10);
        integerMyList.add(1, 20);
        integerMyList.add(2, 30);
        System.out.println();
    }
}
*/
