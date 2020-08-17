package bai_11_dsa_stack_queue.thuc_hanh.optional_deployment_queue_use_array;

public class QueueOptionalMain {
    public static void main(String[] args) {
        MyQueueOptional queue = new MyQueueOptional(5);
        System.out.println(queue.isQueueFull());
        System.out.println(queue.isQueueEmpty());

//        queue.enqueue(10);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.dequeue();
//        queue.dequeue();

        queue.enqueue(4);
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);

    }
}
