package bai_11_dsa_stack_queue.bai_tap.check_chain_palindrome_use_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
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
        String result = " ";
        for (int i = 0; i < str.length() / 2; i++) {
            if (stack.pop().equals(queue.remove())) {
                result = "String is Palindrome";
            } else {
                result = "String is not Palindrome";
            }
        }
        System.out.println(result);
    }
}

// xóa từng ký tự mảng stackBefore và thêm vào mảng mới stackAfter
//        Stack<Character> stackAfter = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            stackAfter.push(stackBefore.pop());
//        }
//                System.out.println(stackAfter);



