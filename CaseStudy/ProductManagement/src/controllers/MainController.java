package controllers;

import commons.FileUtils;
import commons.Validates;
import models.ExportProducts;
import models.ImportedProducts;
import models.Product;

import java.util.List;
import java.util.Scanner;

public class MainController {
    private static String IMPORTED_PRODUCTS = "ImportedProducts";
    private static String EXPORT_PRODUCTS = "ExportProducts";
    public static int id = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenuProductManagement() {

        System.out.println("PROGRAMME MANAGE PRODUCT");

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

    private static void deleteProduct() {
        int choose;

        List<Product> productList = FileUtils.readProduct();

        System.out.println("Enter the code product need to delete");
        scanner.nextLine();
        String codeProduct;

        do {
            codeProduct = scanner.nextLine();
        } while (!Validates.isCodeProduct(codeProduct));
//        throw new NotFoundProductException("Code product is not require, enter again ");

        for (Product product : productList) {
            if (codeProduct.equals(product.getCodeProduct())) {
                System.out.println("Select function 'Yes' or 'No'" +
                        "\n1. Yes - Delete product" +
                        "\n2. No - Back to menu");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        productList.remove(product);
                        FileUtils.writeAllProduct(productList);
                        List<Product> productListRemove = FileUtils.readProduct();
                        int i = 1;
                        for (Product productRemove : productListRemove) {
                            System.out.println("List product after delete " + i + ": " + productRemove.toString());
                            i++;
                        }
                    case 2:
                        displayMenuProductManagement();
                        break;
                }
            }
        }
    }

    private static void showListProduct() {
        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select product need to display" +
                    "\n1. Imported Products" +
                    "\n2. ExportProducts" +
                    "\n3. Back to main menu");
            System.out.println("Enter the type product: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showListImportedProductsProduct();
                    break;
                case 2:
                    showListExportProductsProduct();
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

    private static void showListImportedProductsProduct() {
        List<Product> productList = FileUtils.readProduct();
        int i = 1;
        for (Product product : productList) {
            if (product instanceof ImportedProducts) {
                System.out.println("List imported product " + i + ": " + product.toString());
                i++;
            }
        }
    }

    private static void showListExportProductsProduct() {
        List<Product> productList = FileUtils.readProduct();
        int i = 1;
        for (Product product : productList) {
            if (product instanceof ExportProducts) {
                System.out.println("List export product " + i + ": " + product.toString());
            }
        }
    }

    private static void lookUp() {
        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select function look up the product" +
                    "\n1. By Code Product" +
                    "\n2. By Name Product" +
                    "\n3. Back to main menu");
            System.out.println("Enter the select: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    byCodeProduct();
                    break;
                case 2:
                    byNameProduct();
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

    private static void byCodeProduct() {
        List<Product> productList = FileUtils.readProduct();
        System.out.println("Enter the code product to find");
        scanner.nextLine();
        String code = scanner.nextLine();

        for (Product product : productList) {
            if (code.equals(product.getCodeProduct())) {
                System.out.println("Product need to find: " + product.toString());
            }
        }
    }

    private static void byNameProduct() {
        List<Product> productList = FileUtils.readProduct();
        System.out.println("Enter the name product to find");
        scanner.nextLine();
        String name = scanner.nextLine();

        for (Product product : productList) {
            if (name.equals(product.getNameProduct())) {
                System.out.println("Product need to find: " + product.toString());
            }
        }
    }
}
