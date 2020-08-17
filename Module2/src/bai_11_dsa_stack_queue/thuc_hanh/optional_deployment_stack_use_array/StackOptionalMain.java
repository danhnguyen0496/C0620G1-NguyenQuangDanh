package bai_11_dsa_stack_queue.thuc_hanh.optional_deployment_stack_use_array;

public class StackOptionalMain {
    public static void main(String[] args) throws Exception {
        MyStackOptional stack = new MyStackOptional(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}

