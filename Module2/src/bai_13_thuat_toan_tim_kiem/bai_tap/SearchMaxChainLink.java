package bai_13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchMaxChainLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();

        LinkedList<Character> maxChain = new LinkedList<>();
        LinkedList<Character> listString = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (listString.size() >= 1 && string.charAt(i) <= listString.getLast()) {
                listString.clear();
            }
            listString.add(string.charAt(i));
            if (listString.size() > maxChain.size()) {
                maxChain.clear();
                maxChain.addAll(listString);
            }
        }
        for (Character ch : maxChain) {
            System.out.print(ch);
        }
    }
}
