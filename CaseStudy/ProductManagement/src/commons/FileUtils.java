package commons;

import models.ExportProducts;
import models.ImportedProducts;
import models.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {
    private static ImportedProducts importedProducts;
    private static ExportProducts exportProducts;
    public static String COMMA = ",";
    public static String DOWN = "\n";
    public static final String path = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\ProductManagement\\src\\data\\products.csv";

    // ghi file
    public static void writeFile(String[] content) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.append(concat(content, COMMA));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String concat(String[] content, String character) {
        StringBuffer stringBuffer = new StringBuffer(content[0]);
        for (int i = 1; i < content.length; i++) {
            stringBuffer.append(character);
            stringBuffer.append(content[i]);
        }
        return stringBuffer.toString();
    }

    // doc file kieu doi tuong product
    public static List<Product> readProduct() {

        List<Product> listProducts = new LinkedList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMMA);
                if (temp.length == 9) {
                    importedProducts = new ImportedProducts(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]),
                            Integer.parseInt(temp[4]), temp[5], Double.parseDouble(temp[6]), temp[7], Double.parseDouble(temp[8]));
                    listProducts.add(importedProducts);
                } else if (temp.length == 8) {
                    exportProducts = new ExportProducts(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]),
                            Integer.parseInt(temp[4]), temp[5], Double.parseDouble(temp[6]), temp[7]);
                    listProducts.add(exportProducts);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listProducts;
    }

    // ghi file sau khi xoa mot doi tuong
    public static void writeAllProduct(List<Product> productList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < productList.size(); i++) {
                StringBuilder stringBuilder = new StringBuilder();
                if (productList.get(i) instanceof ImportedProducts) {
                    importedProducts = (ImportedProducts) productList.get(i);
                    stringBuilder.append(importedProducts.getId()).append(COMMA).append(importedProducts.getCodeProduct()).append(COMMA).
                            append(importedProducts.getNameProduct()).append(COMMA).append(importedProducts.getPriceProduct()).append(COMMA).
                            append(importedProducts.getQuantityProduct()).append(COMMA).append(importedProducts.getManufacturer()).append(COMMA).
                            append(importedProducts.getPriceImportedProduct()).append(COMMA).append(importedProducts.getProvinceImportedProduct()).append(COMMA).
                            append(importedProducts.getTaxImportedProduct()).append(DOWN);
                } else if (productList.get(i) instanceof ExportProducts) {
                    exportProducts = (ExportProducts) productList.get(i);
                    stringBuilder.append(exportProducts.getId()).append(COMMA).append(exportProducts.getCodeProduct()).append(COMMA).
                            append(exportProducts.getNameProduct()).append(COMMA).append(exportProducts.getPriceProduct()).append(COMMA).
                            append(exportProducts.getQuantityProduct()).append(COMMA).append(exportProducts.getManufacturer()).append(COMMA).
                            append(exportProducts.getPriceExportProduct()).append(COMMA).append(exportProducts.getCountryExportProduct()).append(DOWN);
                }
                bufferedWriter.write(stringBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

