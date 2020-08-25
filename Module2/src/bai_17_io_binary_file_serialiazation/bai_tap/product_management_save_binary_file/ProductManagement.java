package bai_17_io_binary_file_serialiazation.bai_tap.product_management_save_binary_file;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static List<Product> listProduct = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static final String FILE_PRODUCT_NAME = "D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\bai_17_io_binary_file_serialiazation\\bai_tap\\product_management_save_binary_file\\product.txt";


    // viet danh sach san pham vao file product.txt
    public static void writeProduct(List<Product> productList) throws IOException {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(new File(FILE_PRODUCT_NAME));
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert outputStream != null;
            outputStream.close();
            assert objectOutputStream != null;
            objectOutputStream.close();
        }
    }

    // doc danh sach san pham trong file product.txt
    public static List<Product> readProduct() {
        FileInputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(new File(FILE_PRODUCT_NAME));
            objectInputStream = new ObjectInputStream(inputStream);
            listProduct = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    // them san pham vao listProduct
    public static void addProduct() {
        System.out.print("Nhap ma so san pham: ");
        int maSo = scanner.nextInt();
        scanner.skip("\\R");
        System.out.print("Nhap ten san pham: ");
        String tenSP = scanner.nextLine();
        System.out.print("Nhap hang san xuat san pham: ");
        String hangSX = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        float gia = scanner.nextFloat();

        Product product = new Product(maSo, tenSP, hangSX, gia);
        listProduct.add(product);
        System.out.println(listProduct);
    }

    // hien thi san pham trong listProduct
    public static void displayProduct(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // tim kiem thong tin san pham trong listProduct
    public static void searchInfoProduct() {
        System.out.println("Tim thong tin san pham: ");
        scanner.skip("\\R");
        String inFo = scanner.nextLine();

        for (Product product : listProduct) {
            switch (inFo) {
                case "ma so":
                    System.out.println(product.getMaSo());
                    break;
                case "ten san pham":
                    System.out.println(product.getTenSP());
                    break;
                case "hang san xuat":
                    System.out.println(product.getHangSX());
                    break;
                case "gia":
                    System.out.println(product.getGia());
                    break;
                default:
                    System.out.print("Lua chon tim kiem thong tin san pham khong dung");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        addProduct();
        addProduct();
        writeProduct(listProduct);
        searchInfoProduct();
        readProduct();
        displayProduct(listProduct);
    }
}
