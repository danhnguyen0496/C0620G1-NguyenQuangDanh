package bai_11_dsa_stack_queue.bai_tap.check_bracket_in_expression;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {

        String str = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(bStack(str));
    }

    public static boolean bStack(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()) return false;
                else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}