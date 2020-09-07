package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String path;
    public static String COMMA = ",";
    private static String CSV = ".csv";

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.append(concat(content, COMMA));
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setPath(String fileName) {
        StringBuffer stringBuffer = new StringBuffer("D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\ResortFurama\\src\\data\\");
        stringBuffer.append(fileName);
        stringBuffer.append(CSV);
        FileUtils.path = stringBuffer.toString();
    }

    public static String concat(String[] content, String character) {
        StringBuffer stringBuffer = new StringBuffer(content[0]);
        for (int i = 1; i < content.length; i++) {
            stringBuffer.append(character);
            stringBuffer.append(content[i]);
        }
        return stringBuffer.toString();
    }

    public static List<String> readFile() {
        List<String> stringList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
