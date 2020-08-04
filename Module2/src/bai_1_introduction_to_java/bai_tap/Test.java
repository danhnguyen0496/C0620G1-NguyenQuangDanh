package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Test {
    private static String checkOnes(int num) {
        String readNumber = null;
        switch (num) {
            case 1:
                readNumber = "one";
                break;
            case 2:
                readNumber = "two";
                break;
            case 3:
                readNumber = "three";
                break;
            case 4:
                readNumber = "four";
                break;
            case 5:
                readNumber = "five";
                break;
            case 6:
                readNumber = "six";
                break;
            case 7:
                readNumber = "seven";
                break;
            case 8:
                readNumber = "eight";
                break;
            case 9:
                readNumber = "nine";
                break;
            default:
                System.out.println("fail!!!");
                break;
        }
        return readNumber;
    }

    private static String checkTens(int num) {
        String readNumber = null;
        switch (num) {
            case 2:
                readNumber = "twenty";
                break;
            case 3:
                readNumber = "thirty";
                break;
            case 4:
                readNumber = "forty";
                break;
            case 5:
                readNumber = "fifty";
                break;
            case 6:
                readNumber = "sixty";
                break;
            case 7:
                readNumber = "seventy";
                break;
            case 8:
                readNumber = "eighty";
                break;
            case 9:
                readNumber = "ninety";
                break;
            default:
                System.out.println("fail!!!");
                break;
        }
        return readNumber;
    }

    private static String checkHundreds(int num) {
        String readNumber = null;
        switch (num) {
            case 1:
                readNumber = "one hundred";
                break;
            case 2:
                readNumber = "two hundred";
                break;
            case 3:
                readNumber = "three hundred";
                break;
            case 4:
                readNumber = "four hundred";
                break;
            case 5:
                readNumber = "five hundred";
                break;
            case 6:
                readNumber = "six hundred";
                break;
            case 7:
                readNumber = "seven hundred";
                break;
            case 8:
                readNumber = "eight hundred";
                break;
            case 9:
                readNumber = "nine hundred";
                break;
            default:
                System.out.println("fail!!!");
                break;
        }
        return readNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        String readNumber = null;
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            System.out.println(checkOnes(number));
        } else if (number <= 20) {
            switch (number) {
                case 10:
                    readNumber = "ten";
                    break;
                case 11:
                    readNumber = "eleven";
                    break;
                case 12:
                    readNumber = "twelve";
                    break;
                case 13:
                    readNumber = "thirteen";
                    break;
                case 14:
                    readNumber = "fourteen";
                    break;
                case 15:
                    readNumber = "fifteen";
                    break;
                case 16:
                    readNumber = "sixteen";
                    break;
                case 17:
                    readNumber = "seventeen";
                    break;
                case 18:
                    readNumber = "eighteen";
                    break;
                case 19:
                    readNumber = "nineteen";
                    break;
                case 20:
                    readNumber = "twenty";
                    break;
                default:
                    System.out.println("fail");
                    break;
            }
            System.out.println(readNumber);
        } else if (number < 100) {
            int ones = number % 10;
            int tens = (number - ones) / 10;
            if (ones == 0) {
                System.out.println(checkTens(tens));
            } else {
                System.out.println(checkTens(tens) + " " + checkOnes(ones));
            }
        } else {
            int hundred = (number - number % 100) / 100;
            int ones = (number % 100) % 10;
            int tens = (number % 100 - ones) / 10;
            if (ones == 0 && tens != 0) {
                System.out.println(checkHundreds(hundred) + " " + checkTens(tens));
            }
            if (ones == 0 && tens == 0) {
                System.out.println(checkHundreds(hundred));
            }
            if (ones != 0 && tens == 0) {
                System.out.println(checkHundreds(hundred) + " and " + checkOnes(ones));
            }
            if (ones != 0 && tens != 0) {
                System.out.println(checkHundreds(hundred) + " " + checkTens(tens) + " " + checkOnes(ones));
            }
        }
    }
}

