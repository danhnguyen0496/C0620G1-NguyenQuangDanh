package bai_12_java_collection_framework.bai_tap.use_arraylist_linkedlist_in_java_collection_frameword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {

    public static Scanner scanner = new Scanner(System.in);
    public static Product product = new Product();
    public static ArrayList<Product> listProduct = new ArrayList<Product>();

    public static void addProduct() {
        product = new Product(1, "Táo", 50);
        listProduct.add(product);
        product = new Product(2, "Cam", 100);
        listProduct.add(product);
        product = new Product(3, "Bưởi", 150);
        listProduct.add(product);
        System.out.println(listProduct);




    }

    public static void editProduct(int id) {
        for (Product product : listProduct)
            if (product.getId() == id) {
                System.out.print("Edit the name of product: ");
                String name = scanner.nextLine();
                product.setNameProduct(name);

                System.out.print("Edit the cost of product: ");
                double costs = scanner.nextDouble();
                product.setCost(costs);
            }
        System.out.println(listProduct);
    }

    public static void deleteProduct(int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                listProduct.remove(product);
            }
            System.out.println(listProduct);
        }
    }


    public static void displayProduct() {
        System.out.println("List product: ");
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

//    public static void searchProduct() {
//        System.out.print("Enter the name of product you want to search: ");
//        String name = scanner.nextLine();
//        scanner.skip("\\R");
//        for (Product product : listProduct) {
//            if (product.getNameProduct().equals(name)) {
//                System.out.println(product.toString());
//            }
//        }
//    }

    public static void sortProduct() {
        System.out.println("Sort the product");
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getCost() > o2.getCost()) {
                    return 1;
                }
                if (o1.getCost() < o2.getCost()) {
                    return -1;
                } else return 0;
            }
        });
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }


    public static void main(String[] args) {
        addProduct();
        editProduct(2);
        deleteProduct(1);
        displayProduct();
//        searchProduct();
        sortProduct();
    }
}
