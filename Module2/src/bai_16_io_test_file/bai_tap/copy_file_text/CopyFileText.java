package bai_16_io_test_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\bai_16_io_test_file\\bai_tap\\copy_file_text\\source.txt");
            fileWriter = new FileWriter("D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\bai_16_io_test_file\\bai_tap\\copy_file_text\\target.txt");
            int read;
            int count = 0;
            while ((read = fileReader.read()) != -1) {
                fileWriter.write(read);
                count++;
                System.out.print((char)read);
            }
            System.out.println("\nTotal character in file: " + count);
        } catch (IOException e) {
            System.err.println("Source files already exist or are duplicated");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
