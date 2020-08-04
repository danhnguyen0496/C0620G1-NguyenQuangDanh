package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class TestChuSo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn đọc: ");
        number = sc.nextInt();
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number % 100 - num1) / 10;
        num3 = (number - num2 * 10 - num1) / 100;
        String cNum1 = null, cNum2 = null, cNum3 = null;
        switch (num1) {
            case 0:
                cNum1 = "zero";
                break;
            case 1:
                cNum1 = "one";
                break;
            case 2:
                cNum1 = "two";
                break;
            case 3:
                cNum1 = "three";
                break;
            case 4:
                cNum1 = "four";
                break;
            case 5:
                cNum1 = "five";
                break;
            case 6:
                cNum1 = "six";
                break;
            case 7:
                cNum1 = "seven";
                break;
            case 8:
                cNum1 = "eight";
                break;
            case 9:
                cNum1 = "nine";
                break;
        }
        switch (num2) {
            case 0:
                cNum2 = "";
                break;
            case 1:
                switch (num1) {
                    case 0:
                        cNum1 = "ten";
                        cNum2 = "";
                        break;
                    case 1:
                        cNum1 = "eleven";
                        cNum2 = "";
                        break;
                    case 2:
                        cNum1 = "twelve";
                        cNum2 = "";
                        break;
                    case 3:
                        cNum1 = "thirdteen";
                        cNum2 = "";
                        break;
                    default:
                        cNum2 = cNum1 + "teen";
                        cNum1 = "";
                }
                break;
            case 2:
                cNum2 = "twenty";
                break;
            case 3:
                cNum2 = "thirdty";
                break;
            case 4:
                cNum2 = "fourty";
                break;
            case 5:
                cNum2 = "fifty";
                break;
            case 6:
                cNum2 = "sixty";
                break;
            case 7:
                cNum2 = "seventy";
                break;
            case 8:
                cNum2 = "eighty";
                break;
            case 9:
                cNum2 = "ninety";
                break;
        }
        switch (num3) {
            case 0:
                cNum3 = "";
                break;
            case 1:
                cNum3 = "One";
                break;
            case 2:
                cNum3 = "Two";
                break;
            case 3:
                cNum3 = "Three";
                break;
            case 4:
                cNum3 = "Four";
                break;
            case 5:
                cNum3 = "Five";
                break;
            case 6:
                cNum3 = "Six";
                break;
            case 7:
                cNum3 = "Seven";
                break;
            case 8:
                cNum3 = "Eight";
                break;
            case 9:
                cNum3 = "Nine";
                break;
        }
        if (num3 == 0) {
            System.out.print(cNum2 + " " + cNum1);
        } else {
            if (num2 == 0) {
                if (num1 == 0) {
                    System.out.print(cNum3 + " hundered");
                } else {
                    System.out.print(cNum3 + " hundered and " + cNum1);
                }
            } else {
                if (num1 == 0) {
                    System.out.print(cNum3 + " hundered and " + cNum2);
                } else {
                    System.out.print(cNum3 + " hundered and " + cNum2 + " " + cNum1);
                }
            }
        }
    }
}

