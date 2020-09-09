package product_management.controllers;

import product_management.commons.FileUtils;
import product_management.commons.Validates;
import product_management.modules.ExportProducts;
import product_management.modules.ImportedProducts;
import product_management.modules.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static String IMPORTED_PRODUCTS = "importedProducts";
    private static String EXPORT_PRODUCTS = "exportProducts";
    private static Scanner scanner = new Scanner(System.in);
    private static int id = 1;

    // menu hien thi chinh
    public static void displayMenuProductManagement() {

        System.out.println("==============================");
        System.out.println("= PRODUCT MANAGEMENT PROGRAM =");
        System.out.println("==============================");

        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select function by number (to continue) " +
                    "\n1. Add New Product" +
                    "\n2. Delete Product" +
                    "\n3. Show List Product" +
                    "\n4. Lookup" +
                    "\n5. Exit");
            System.out.println("Enter the function: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    showListProduct();
                    break;
                case 4:
                    lookUp();
                    break;
                case 5:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 5);
    }

    // them san pham
    private static void addNewProduct() {

        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select product to add new product" +
                    "\n1. Imported Products" +
                    "\n2. ExportProducts" +
                    "\n3. Back to main menu");
            System.out.println("Enter the type product: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewProduct(IMPORTED_PRODUCTS);
                    break;
                case 2:
                    addNewProduct(EXPORT_PRODUCTS);
                    break;
                case 3:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 3);
    }

    private static void addNewProduct(String nameProduct) {

        System.out.println("Enter the code product: ");
        String code;
        scanner.nextLine();
        do {
            code = scanner.nextLine();
        } while (!Validates.isCodeProduct(code));


        System.out.println("Enter the name product: ");
        String name;
        do {
            name = scanner.nextLine();
        } while (!Validates.isProduct(name));

        System.out.println("Enter the price product: ");
        String price;
        do {
            price = scanner.nextLine();
        } while (!Validates.isPositiveNumbers(price));

        System.out.println("Enter the quantity product: ");
        String quantity;
        do {
            quantity = scanner.nextLine();
        } while (!Validates.isPositiveNumbers(quantity));


        System.out.println("Enter the manufacturer: ");
        String manufacturer;
        do {
            manufacturer = scanner.nextLine();
        } while (!Validates.isProduct(manufacturer));

        if (nameProduct.equals(IMPORTED_PRODUCTS)) {


            System.out.println("Enter the price imported product: ");
            String priceImportedProduct;
            do {
                priceImportedProduct = scanner.nextLine();
            } while (!Validates.isPositiveNumbers(priceImportedProduct));

            System.out.println("Enter the province imported product: ");
            String provinceImportedProduct;
            do {
                provinceImportedProduct = scanner.nextLine();
            } while (!Validates.isProduct(provinceImportedProduct));


            System.out.println("Enter the tax imported product: ");
            String taxImportedProduct;
            do {
                taxImportedProduct = scanner.nextLine();
            } while (!Validates.isPositiveNumbers(taxImportedProduct));

            FileUtils.writeFile(new String[]{String.valueOf(id++), code, name, price, quantity,
                    manufacturer, priceImportedProduct, provinceImportedProduct, taxImportedProduct});
        } else if (nameProduct.equals(EXPORT_PRODUCTS)) {

            System.out.println("Enter the price export product: ");
            String priceExportProduct;
            do {
                priceExportProduct = scanner.nextLine();
            } while (!Validates.isPositiveNumbers(priceExportProduct));

            System.out.println("Enter the country export product: ");
            String countryExportProduct;
            do {
                countryExportProduct = scanner.nextLine();
            } while (!Validates.isProduct(countryExportProduct));

            FileUtils.writeFile(new String[]{String.valueOf(id++), code, name, price, quantity,
                    manufacturer, priceExportProduct, countryExportProduct});
        }
    }


    // xoa san pham
    private static void deleteProduct() {
        List<Product> productList = FileUtils.readProduct();

        System.out.println("Enter the code product: ");
        scanner.nextLine();
        String code = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (code.equals(productList.get(i).getCodeProduct())) {

                /** lam them cho dung menu**/
                productList.remove(productList.get(i));
                List<Product> productListRemove = new ArrayList<>(productList);
                FileUtils.writeAllProduct(productListRemove);
            }
        }
    }

    // hien thi san pham
    private static void showListProduct() {
        int choose;
        boolean isExit = false;
        do {
            System.out.println("Show information product: " +
                    "\n1. ImportedProducts" +
                    "\n2. ExportProducts" +
                    "\n3. Back to menu");
            System.out.println("Enter the select");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showImportedProducts();
                    break;
                case 2:
                    showExportProducts();
                    break;
                case 3:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 3);
    }

    private static void showImportedProducts() {
        List<Product> productList = FileUtils.readProduct();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) instanceof ImportedProducts) {
                System.out.println(productList.get(i).toString());
            }
        }
    }

    private static void showExportProducts() {
        List<Product> productList = FileUtils.readProduct();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) instanceof ExportProducts) {
                System.out.println(productList.get(i).toString());
            }
        }
    }


    // tim kiem san pham
    private static void lookUp() {
        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select search function by Product Code or Product Name" +
                    "\n1. Search Product Code" +
                    "\n2. Search  Product Name" +
                    "\n3. Back to menu");
            System.out.println("Enter the select");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    searchProductCode();
                    break;
                case 2:
                    searchProductName();
                    break;
                case 3:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 3);
    }

    private static void searchProductCode() {
        List<Product> productList = FileUtils.readProduct();
        System.out.println("Enter the code product need to search: ");
        scanner.nextLine();
        String code = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (code.equals(productList.get(i).getCodeProduct())) {
                System.out.println(productList.get(i));
            }
        }
    }

    private static void searchProductName() {
        List<Product> productList = FileUtils.readProduct();
        System.out.println("Enter the name product need to search: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getNameProduct())) {
                System.out.println(productList.get(i));
            }
        }
    }
}
