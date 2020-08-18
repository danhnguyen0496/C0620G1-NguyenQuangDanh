package bai_11_dsa_stack_queue.bai_tap.count_number_appear_of_word_in_chain_use_map;

import java.util.HashMap;
import java.util.Stack;

public class CountWordChain {
    public void countWord(String str) {

        Stack<String> stack = new Stack<>();
        String[] string = str.split(" ");
        for (int i = 0; i < str.length(); i++) {
            stack.push(string[i].toLowerCase());
        }

    }
}
