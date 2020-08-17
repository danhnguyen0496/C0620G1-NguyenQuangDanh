package bai_11_dsa_stack_queue.bai_tap.reverse_element_array_integer_use_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElementStack {
    public static void main(String[] args) {

        // Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Array was inputted: " + stack);

        Stack<Integer> reverseStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            reverseStack.push(stack.pop());
        }
        System.out.println("Array was reversed: " + reverseStack);

        // Đảo ngược chuỗi sử dụng Stack

        Stack<Character> wStack = new Stack<>();
        String str = "Đảo ngược phần tử trong mảng số nguyên";
        for (int i = 0; i < str.length(); i++) {
            wStack.push(str.charAt(i));
        }
        System.out.println("Character was inputted: " + wStack);

        Stack<Character> reverseW = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            reverseW.push(wStack.pop());
        }
        System.out.println("Character was reversed: " + reverseW);


        Stack<String> wwStack = new Stack<>();
        String string = "Đảo ngược phần tử trong mảng số nguyên";
        String[] mWord = string.split(" ");
        for (String word : mWord) {
            wwStack.push(word);
        }
        System.out.println("String was inputted: " + wwStack);

        Stack<String> reversedWW = new Stack<>();
        for (String word : mWord) {
            reversedWW.push(wwStack.pop());
        }
        System.out.println("String was reversed: "+ reversedWW);
    }
}

