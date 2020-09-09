package manage_contact.controllers;

import manage_contact.commons.FileUtils;
import manage_contact.commons.Validates;
import manage_contact.models.ManageContact;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayManageContact() {
        System.out.println("PROGRAMME MANAGE CONTACT");

        int choose;
        boolean isExit = false;
        do {
            System.out.println("Menu function by number" +
                    "\n1. Display list contact" +
                    "\n2. Add new contact" +
                    "\n3. Update contact" +
                    "\n4. Delete contact" +
                    "\n5. Lookup contact" +
                    "\n6. Read file" +
                    "\n7. Write file" +
                    "\n8. Exit");
            System.out.println("Enter the select function: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    displayListContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    lookupContact();
                    break;
                case 6:
                    readFile();
                    break;
                case 7:
//                 writerFile();
//                    break;
                case 8:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        }
        while (choose >= 1 && choose <= 8);
    }

//    private static void writerFile() {
//        FileUtils.writeFile();
//    }

    private static void readFile() {
        List<ManageContact> manageContactList = FileUtils.readFile();
        System.out.println("Display list contact: ");
        int i = 1;
        for (ManageContact manageContact : manageContactList) {
            System.out.println(i + ": " + manageContact.toString());
            i++;
        }
    }

    private static void displayListContact() {
        List<ManageContact> manageContactList = FileUtils.readFile();
        System.out.println("Display list contact: ");
        int i = 1;
        for (ManageContact manageContact : manageContactList) {
            System.out.println(i + ": " + manageContact.toString());
            i++;
        }
    }

    private static void addNewContact() {

        ManageContact manageContact = new ManageContact();

        System.out.println("Enter the number phone:");
        String number;
        scanner.nextLine();
        do {

            number = scanner.nextLine();
        } while (!Validates.isNumbers(number));
        manageContact.setPhoneNumber(number);

        System.out.println("Enter the contact group: ");
        String contactGroup;
        do {
            contactGroup = scanner.nextLine();
        } while (!Validates.isContact(contactGroup));
        manageContact.setContactGroup(contactGroup);

        System.out.println("Enter the name: ");
        String name;
        do {
            name = scanner.nextLine();
        } while (!Validates.isContact(name));
        manageContact.setName(name);

        System.out.println("Enter the gender: ");
        String gender;
        do {
            gender = scanner.nextLine();
        } while (!Validates.isGender(gender));
        manageContact.setGender(gender);

        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        manageContact.setAddress(address);

        System.out.println("Enter the birthday: ");
        String birthday = scanner.nextLine();
        manageContact.setBirthday(birthday);

        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        manageContact.setEmail(email);

        List<ManageContact> manageContactList = new LinkedList<>();
        manageContactList.add(manageContact);

        System.out.println(manageContactList.toString());

        FileUtils.writeFile(manageContactList, manageContact);
    }

    private static void updateContact() {

    }

    private static void deleteContact() {
        List<ManageContact> manageContactList = FileUtils.readFile();
        System.out.println("Enter the number phone to delete: ");
        scanner.nextLine();
        String numberPhone = scanner.nextLine();

        for (int i = 0; i < manageContactList.size(); i++) {
            if (numberPhone.equals(manageContactList.get(i).getPhoneNumber())) {
                System.out.println("Confirm delete, lest enter 'Y'");
                String confirm = scanner.nextLine();
                if (confirm.equals('Y')) {
                    manageContactList.remove(manageContactList.get(i));
                } else if (!confirm.equals('Y')) {
                    displayManageContact();
                }
            } else {
                System.out.println("The number phone not find");
                break;
            }
        }

//        List <ManageContact> manageContactRemove = new ArrayList<>(manageContactList);
//        // writer sau khi xoa
//        final String DOWN = "\n";
//        final String COMMA = ", ";
//        final String path = "D:\\C0620G1-NguyenQuangDanh\\Module2\\src\\manage_contact\\data\\contacts.csv";
//        try {
//            FileWriter fileWriter = new FileWriter(new File(path));
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (ManageContact manageContactNew : manageContactRemove ){
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append(manageContactRemove.get).append(COMMA).append(dictionaryRemove.getPronounce()).append(COMMA).
//                        append(dictionaryRemove.getAdjective()).append(COMMA).append(dictionaryRemove.getExample()).append(COMMA).
//                        append(dictionaryRemove.getNoun()).append(COMMA).append(dictionaryRemove.getSimilar()).append(DOWN);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void lookupContact() {

        int choose;
        boolean isExit = false;
        do {
            System.out.println("Find" +
                    "\n1. Number phone" +
                    "\n2. Name");
            System.out.println("Enter select:");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    lookUpNumberPhone();
                    break;
                case 2:
                    lookUpName();
                    break;
                case 3:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        }
        while (choose >= 1 && choose <= 3);
    }

    private static void lookUpName() {
        List<ManageContact> manageContactList = FileUtils.readFile();

        System.out.println("Enter the name to find");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (ManageContact manageContact : manageContactList) {
            if (name.equals(manageContact.getName())) {
                System.out.println("Contact: " + manageContact);
            }
        }
    }

    private static void lookUpNumberPhone() {
        List<ManageContact> manageContactList = FileUtils.readFile();

        System.out.println("Enter the number phone to find");
        String phone = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < manageContactList.size(); i++) {
            if (phone.equals(manageContactList.get(i).getPhoneNumber())) {
                System.out.println("Contact: " + manageContactList.get(i));
            }
        }
    }
}