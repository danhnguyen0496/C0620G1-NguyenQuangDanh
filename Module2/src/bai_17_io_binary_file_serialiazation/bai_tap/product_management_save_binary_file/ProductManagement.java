package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.*;
import java.util.Scanner;

public class ProductManagement extends StockProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập địa chỉ file: ");
        String path = scanner.nextLine();
        File file = new File(path);
        try {
            addProduct(file);
            displayProduct(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addProduct(File productData) {
        try {
            OutputStream outputProduct = new FileOutputStream(productData);
            ObjectOutputStream outputStream = new ObjectOutputStream(outputProduct);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào mã số: ");
            int maSo = scanner.nextInt();
            System.out.print("Nhập vào tên sản phẩm: ");
            scanner.skip("\\R");
            String tenSP = scanner.nextLine();
            System.out.print("Nhập vào hãng sản xuất: ");
            String hangSX = scanner.nextLine();
            System.out.print("Nhập vào giá: ");
            float gia = scanner.nextFloat();

            StockProduct products = new StockProduct(maSo, tenSP, hangSX, gia);
            outputStream.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayProduct(File productData) {
        try {
            InputStream inputProduct = new FileInputStream(productData);
            ObjectInputStream inputStream = new ObjectInputStream(inputProduct);

            StockProduct[] products = (StockProduct[]) inputStream.readObject();
            for (StockProduct product : products) {
                System.out.println(product.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchInfoProduct(File productData) {
        try {
            InputStream inputProduct = new FileInputStream(productData);
            ObjectInputStream inputStream = new ObjectInputStream(inputProduct);

            StockProduct[] products = (StockProduct[]) inputStream.readObject();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào tên sản phẩm cần tìm kiếm: ");
            String timSP = scanner.nextLine();
            for (StockProduct product : products) {
                if (timSP.equals(product)) {
                    System.out.println(product.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//D:\C0620G1-NguyenQuangDanh\Module2\src\bai_17_io_binary_file_serialiazation\bai_tap\product_management_save_binary_file\product.txt