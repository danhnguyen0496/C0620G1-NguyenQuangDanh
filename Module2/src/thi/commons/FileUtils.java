package thi.commons;

import thi.models.ContactManage;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {
    public static String path = "D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\thi\\data\\contacts.csv";
    public static String COMMA = ",";
    public static String DOWN = "\n";

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

    // ghi file doi tuong
    public static void writeFile(List<ContactManage> contactManagesList,  ContactManage contactManage) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(contactManage.getNumberPhone()).append(COMMA).append(contactManage.getContactGroup()).append(COMMA).
                    append(contactManage.getName()).append(COMMA).append(contactManage.getGender()).append(COMMA).
                    append(contactManage.getAddress()).append(COMMA).append(contactManage.getBirthday()).append(COMMA).
                    append(contactManage.getEmail()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // doc file
    public static List<ContactManage> readFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        List<ContactManage> contactManageList = new LinkedList<>();

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String[] temp;
            ContactManage contactManage;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMMA);
                contactManage = new ContactManage(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                contactManageList.add(contactManage);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contactManageList;
    }
}
