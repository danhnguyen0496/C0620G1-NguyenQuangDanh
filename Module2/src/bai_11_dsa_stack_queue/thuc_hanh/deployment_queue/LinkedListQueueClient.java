package bai_11_dsa_stack_queue.thuc_hanh.deployment_queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
//        queue.dequeue();
//        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(30);
        queue.enqueue(40);
//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
