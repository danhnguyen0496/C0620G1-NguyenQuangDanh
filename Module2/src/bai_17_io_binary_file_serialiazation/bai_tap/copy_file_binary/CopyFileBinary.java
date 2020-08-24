package bai_17_io_binary_file_serialiazation.bai_tap.copy_file_binary;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path source: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter the path dest: ");
        String destPath = scanner.nextLine();

        File fileSource = new File(sourcePath);
        File fileDest = new File(destPath);
        try {
            copyFile(fileSource, fileDest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[2069];
            int length;
            int bytes = inputStream.available();
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("Copy completed");
            System.out.println("Total bytes in file can read: "+ bytes + " bytes");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
//D:\C0620G1-NguyenQuangDanh\Module2\src\bai_17_io_binary_file_serialiazation\bai_tap\copy_file_binary\source
//D:\C0620G1-NguyenQuangDanh\Module2\src\bai_17_io_binary_file_serialiazation\bai_tap\copy_file_binary\dest
