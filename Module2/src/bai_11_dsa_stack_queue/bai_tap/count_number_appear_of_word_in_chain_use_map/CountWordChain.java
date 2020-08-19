package bai_11_dsa_stack_queue.bai_tap.count_number_appear_of_word_in_chain_use_map;

import java.util.TreeMap;

public class CountWordChain {
    public void countWord(String str) {

        str = str.toLowerCase();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] string = str.split(" ");
        for (String element : string) {
            if (treeMap.containsKey(element)) {
                int value = treeMap.get(element);
                treeMap.put(element, ++value);
            } else {
                treeMap.put(element, 1);
            }
        }
        System.out.println(treeMap);
    }
}
