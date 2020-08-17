package bai_11_dsa_stack_queue.bai_tap.deployment_queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(5);
        System.out.println(queue.disPlayQueue());
        queue.enQueue(4);
        System.out.println(queue.disPlayQueue());
        queue.enQueue(3);
        System.out.println(queue.disPlayQueue());
        queue.enQueue(2);
        System.out.println(queue.disPlayQueue());
        queue.enQueue(1);
        System.out.println(queue.disPlayQueue());
        queue.deQueue();
        System.out.println(queue.disPlayQueue());
        queue.deQueue();
        System.out.println(queue.disPlayQueue());
    }
}
