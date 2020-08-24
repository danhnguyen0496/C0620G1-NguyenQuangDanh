package bai_17_io_binary_file_serialiazation.thuc_hanh.copy_large_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyLargeFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file source: ");
        String source = scanner.nextLine();
        System.out.print("Enter the file dest: ");
        String dest = scanner.nextLine();

        File fileSource = new File(source);
        File fileDest = new File(dest);
        try {
//          copyFileUsingJava7Files(fileSource, fileDest);
            copyFileUsingStream(fileSource, fileDest);
            System.out.println("Copy completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
//        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            inputStream.close();
            assert outputStream != null;
            outputStream.close();
        }
    }
}

//    Enter the file source: D:\C0620G1-NguyenQuangDanh\Module2\src\bai_17_io_binary_file_serialiazation\thuc_hanh\copy_large_file\chocopy.txt
//    Enter the file dest: D:\C0620G1-NguyenQuangDanh\Module2\src\bai_17_io_binary_file_serialiazation\thuc_hanh\copy_large_file\nhancopy.txt
