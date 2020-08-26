package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementCSV {

    public static final String FILE = "D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\bai_17_io_binary_file_serialiazation\\bai_tap\\product_management_save_binary_file\\product.csv";
    public static Scanner scanner = new Scanner(System.in);
    public static List<ProductCSV> productList = new LinkedList<>();


    public static void addProduct() {
        System.out.print("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter the price: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter the other: ");
        String other = scanner.nextLine();

        ProductCSV productCSV = new ProductCSV();
        productCSV.setId(id);
        productCSV.setName(name);
        productCSV.setManufacturer(manufacturer);
        productCSV.setPrice(price);
        productCSV.setOther(other);
        productList.add(productCSV);
        System.out.println(productCSV);
        writerProduct(productCSV);
    }

    public static void writerProduct(ProductCSV productCSV) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String[] product = productCSV.toString().split(", ");
        try {
            fileWriter = new FileWriter(new File(FILE), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < product.length; i++) {
//                bufferedWriter.write(product[i]);
                bufferedWriter.append(product[i]);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        addProduct();
        addProduct();
    }
}
