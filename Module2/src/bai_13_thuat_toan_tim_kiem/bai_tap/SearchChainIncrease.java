/** Tìm chuỗi tăng dần có độ dài lớn nhất **/

package bai_13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchChainIncrease {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<Character> maxCharacters = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> listString = new LinkedList<>();
            listString.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > listString.getLast()) {
                    listString.add(string.charAt(j));
                }
            }

            if (listString.size() > maxCharacters.size()) {
                maxCharacters.clear();
                maxCharacters.addAll(listString);
            }
            listString.clear();
        }
        for (Character ch : maxCharacters) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println(maxCharacters);
    }
}
