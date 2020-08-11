package bai_8_clean_code_refactoring.thuc_hanh.refactoring_split_valuable;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
//        if(number % 3 == 0 && number % 5 == 0)
//            return "FizzBuzz";
//
//        if(number % 3 == 0)
//            return "Fizz";
//
//        if(number % 5 == 0)
//            return "Buzz";
//
//        return number + "";

        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) { return "FizzBuzz"; }
        if (isBuzz){ return "Buzz"; }
        if (isFizz) { return "Fizz"; }
        return number + "";
    }
}