package bai_16_io_test_file.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static void main(String[] args) throws IOException {
        FileReader fileReaderCSV = null;
        BufferedReader bufferCSV = null;
        String line = "";
        try {
            fileReaderCSV = new FileReader("D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\bai_16_io_test_file\\bai_tap\\read_file_csv\\csv.csv");
            bufferCSV = new BufferedReader(fileReaderCSV);
            while ((line = bufferCSV.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferCSV != null) {
                bufferCSV.close();
            }
        }
    }
}
