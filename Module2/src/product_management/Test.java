package product_management;

import product_management.commons.FileUtils;
import product_management.commons.Validates;
import product_management.controllers.MainController;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       double a =5.5;
       double b =7.0;
       double c= 2.5;
       double d = --a + ++b +a - --c;
        System.out.println(d);

//        List<String> listProduct = FileUtils.readFile();
//        System.out.println(listProduct);
//
//        System.out.println("Enter the code product: ");
////        scanner.nextLine();
//        String code = scanner.nextLine();
//        System.out.println(code);
//        for (int i = 0; i < listProduct.size(); i++) {
//            if (code.equals(listProduct.get(i))) {
//
//                System.out.println(listProduct.get(i));
//            }
//        }
    }
}
