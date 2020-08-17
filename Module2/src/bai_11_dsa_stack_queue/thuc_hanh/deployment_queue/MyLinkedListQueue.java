package bai_11_dsa_stack_queue.thuc_hanh.deployment_queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    private int numNodes = 0;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        public int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
