package bai_11_dsa_stack_queue.bai_tap.check_chain_palindrome_use_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ChainPalindromeCheck {
    public void checkChain() {
        String str = "Able was I ere I saw Elba";
        // thêm ký tự vào stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);

        // thêm ký tự vào queue
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        System.out.println(queue);

        // so sánh stack.pop() và queue.remove()
        Character[] st1 = new Character[str.length() / 2];
        Character[] st2 = new Character[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            st1[i] = stack.pop();
            st2[i] = queue.remove();
        }
        if (Arrays.equals(st1, st2)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}



