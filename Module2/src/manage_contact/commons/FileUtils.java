package manage_contact.commons;

import manage_contact.models.ManageContact;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtils {
    public static String COMMA = ",";
    public static String DOWN = "\n";
    private static final String path = "D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\manage_contact\\data\\contacts.csv";

    // doc file
    public static List<ManageContact> readFile() {
        List<ManageContact> manageContactList = new LinkedList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            ManageContact manageContact;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMMA);
                manageContact = new ManageContact(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                manageContactList.add(manageContact);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return manageContactList;
    }


    // ghi file
    public static void writeFile(List<ManageContact> manageContactList, ManageContact manageContact) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(manageContact.getPhoneNumber()).append(COMMA).append(manageContact.getContactGroup()).append(COMMA).
                    append(manageContact.getName()).append(COMMA).append(manageContact.getGender()).append(COMMA).
                    append(manageContact.getAddress()).append(COMMA).append(manageContact.getBirthday()).append(COMMA).
                    append(manageContact.getEmail()).append(DOWN);
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

    // writer sau khi xoa


}
