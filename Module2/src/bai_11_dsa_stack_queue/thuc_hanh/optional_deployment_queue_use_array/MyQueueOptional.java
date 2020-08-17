package bai_11_dsa_stack_queue.thuc_hanh.optional_deployment_queue_use_array;

public class MyQueueOptional {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail = -1;
    private int currentSize;

    public MyQueueOptional(int currentSize) {
        this.capacity  = currentSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Can't push the item");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element: " + item);
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Can't remove the item");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Remove item: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Remove item: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
