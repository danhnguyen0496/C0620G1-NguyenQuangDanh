package bai_12_java_collection_framework.bai_tap.use_arraylist_linkedlist_in_java_collection_frameword;

import java.util.*;

public class ProductManager {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> listProduct = new ArrayList<Product>();

    public static void addProduct() {
        Product product = new Product();
        System.out.print("Enter the id: ");
        int id = scanner.nextInt();
        product.setId(id);
        System.out.print("Enter the name: ");
        scanner.skip("\\R");
        String name = scanner.nextLine();
        product.setNameProduct(name);
        System.out.print("Enter the costs: ");
        double costs = scanner.nextDouble();
        product.setCost(costs);
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
//        Iterator<Product> iterator = listProduct.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if (product.getId() == id) {
//                iterator.remove();
//            }
//        }
//        System.out.println(listProduct);
        listProduct.removeIf(product -> product.getId() == id);
        System.out.println(listProduct);
    }


    public static void displayProduct() {
        System.out.println("List product: ");
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }

    public static void searchProduct() {
        System.out.print("Enter the name of product you want to search: ");
        String name = scanner.nextLine();
        Iterator<Product> iterator = listProduct.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getNameProduct().equals(name)) {
                System.out.println(product.toString());
            }
        }
    }

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
        addProduct();
        addProduct();
//        editProduct(2);
        displayProduct();
        deleteProduct(2);
//        searchProduct();
//        sortProduct();
    }
}
