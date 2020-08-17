package bai_11_dsa_stack_queue.bai_tap.deployment_queue;

import java.util.Queue;

public class MyQueue {
    private Node front;
    private Node rear;
    public int numNodes = 0;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            this.rear = this.front = temp;
        } else {
            this.rear.link = temp;
            this.rear = temp;
        }
        this.rear.link = front;  // vị trí rear mới được chèn trỏ tới vị trí front của liên kết vòng
        numNodes++;
    }

    public void deQueue() {
        if (isEmpty()) System.out.println("Queue is empty");
        else if (this.front == this.rear) this.front = this.rear = null;
        else {
            this.front = this.front.link;
            this.rear.link = this.front;   // vị trí rear trỏ tới vị trí của front mới
        }
        numNodes--;
    }

    public boolean isEmpty() {
        if (this.front == null) return true;
        return false;
    }

    public String disPlayQueue() {
        Node temp = front;
        String str = "[";
        for (int i = 0; i < numNodes - 1; i++) {
            str += temp.data + ", ";
            temp = temp.link;
        }
        str += this.rear.data + "]";
        return str;
    }
}
