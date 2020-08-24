/** Tìm chuỗi tăng dần có độ dài lớn nhất **/

package bai_13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchChainIncreaseMaxHigh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");

        // A B C B A D E

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
//        System.out.println(maxCharacters);
    }
}

/*********************************************************************************
 * 	Analyze the time complexity of your program:                                  *
 * 	1 outerloop = n;                                                              *
 * 	1 innerloop = n - 1;                                                          *
 *  1 simple statement = 1                                                        *
 * 	1 single loop * 1 simple statement = 1;                                       *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2) Quadratic time;                                                 *
 *********************************************************************************/
