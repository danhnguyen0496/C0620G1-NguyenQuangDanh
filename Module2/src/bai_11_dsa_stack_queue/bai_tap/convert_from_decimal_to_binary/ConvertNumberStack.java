package bai_11_dsa_stack_queue.bai_tap.convert_from_decimal_to_binary;

import java.util.Stack;

public class ConvertNumberStack {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Result convert binary: " +);

    }

    public void convertBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            int n = number % 2;
            stack.push(n);
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
