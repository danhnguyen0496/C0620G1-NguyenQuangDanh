package thi.controllers;

import thi.commons.FileUtils;
import thi.commons.Validates;
import thi.models.ContactManage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayContactManage() {
        System.out.println("PROGRAMME MANAGE CONTACT");

        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select function by number to continue" +
                    "\n1. Display List Contact" +
                    "\n2. Add New Contact" +
                    "\n3. Update Contact" +
                    "\n4. Delete Contact" +
                    "\n5. Lookup Contact" +
                    "\n6. Read File Contact" +
                    "\n7. Write File Contact" +
                    "\n8. Exit");
            System.out.println("Enter the select");
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
                    lookUpContact();
                    break;
                case 6:
                    readFileContact();
                    break;
                case 7:
                    writeFileContact();
                    break;
                case 8:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        } while (choose >= 1 && choose <= 8);
    }

    public static List<ContactManage> contactManageList = new LinkedList<>();

    private static void displayListContact() {

        System.out.println("Show list contact");

        for (ContactManage contactManage : contactManageList) {
            System.out.println("Number phone: " + contactManage.getNumberPhone());
            System.out.println("Contact Group: " + contactManage.getContactGroup());
            System.out.println("Name: " + contactManage.getName());
            System.out.println(("Gender: " + contactManage.getGender()));
            System.out.println(("Address: " + contactManage.getAddress()));
        }
    }

    private static ContactManage contactManage = new ContactManage();

    private static void addNewContact() {

        System.out.println("Enter the number phone:");
        String number;
        scanner.nextLine();
        do {
            number = scanner.nextLine();
        } while (!thi.commons.Validates.isNumbers(number));
        contactManage.setNumberPhone(number);

        System.out.println("Enter the contact group: ");
        String contactGroup = scanner.nextLine();
        contactManage.setContactGroup(contactGroup);

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        contactManage.setName(name);

        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        contactManage.setGender(gender);

        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        contactManage.setAddress(address);

        System.out.println("Enter the birthday: ");
        String birthday = scanner.nextLine();
        contactManage.setBirthday(birthday);

        System.out.println("Enter the email: ");
        String email;
        do {
            email = scanner.nextLine();
        } while (!thi.commons.Validates.isEmail(email));
        contactManage.setEmail(email);

        System.out.println("Add information contact success.");
        contactManageList.add(contactManage);

        System.out.println(contactManageList.toString());

//        FileUtils.writeFile(new String[]{number, contactGroup, name, gender, address, birthday, email});
    }

    private static void updateContact() {

        System.out.println("Enter the number phone need to update");
        scanner.nextLine();

        // sua lai
        String numberPhone;

        numberPhone = scanner.nextLine();

        validateNumber:
        do {
            for (ContactManage contactManage : contactManageList) {
                if (contactManage.getNumberPhone().equals(numberPhone)) break validateNumber;
            }
            System.out.println("The number phone is not find, enter the number phone again");
            numberPhone = scanner.nextLine();
            if (numberPhone.equals("")) return;
        } while (true);

        for (int i = 0; i < contactManageList.size(); i++) {
            if (numberPhone.equals(contactManageList.get(i).getNumberPhone())) {
                System.out.println("Enter the information need to update");

                System.out.println("Enter the contact group: ");
                contactManage.setContactGroup(scanner.nextLine());

                System.out.println("Enter the contact name: ");
                contactManage.setName(scanner.nextLine());

                System.out.println("Enter the contact gender: ");
                contactManage.setGender(scanner.nextLine());

                System.out.println("Enter the contact address: ");
                contactManage.setAddress(scanner.nextLine());

                System.out.println("Enter the contact birthday: ");
                contactManage.setBirthday(scanner.nextLine());

                System.out.println("Enter the email: ");
                String email;
                do {
                    email = scanner.nextLine();
                } while (!thi.commons.Validates.isEmail(email));
                contactManage.setEmail(email);

                System.out.println(contactManageList.toString());
            }
        }
        System.out.println("Edit information contact success");
    }

    private static void deleteContact() {
        System.out.println("Enter the number phone need to delete");
        scanner.nextLine();

        //sua lai
        String numberPhone;
        numberPhone = scanner.nextLine();

        validateNumber:
        do {
            for (ContactManage contactManage : contactManageList) {
                if (contactManage.getNumberPhone().equals(numberPhone)) break validateNumber;
            }
            System.out.println("The number phone is not find, enter the number phone again");
            numberPhone = scanner.nextLine();
            if (numberPhone.equals("")) return;
        } while (true);

        for (int i = 0; i < contactManageList.size(); i++) {
            if (numberPhone.equals(contactManageList.get(i).getNumberPhone())) {
                System.out.println("User must char 'Y' to delete ");
                String inputCharacter = scanner.nextLine();
                if (inputCharacter.equals("Y")) {
                    contactManageList.remove(contactManageList.get(i));
                    System.out.println("Contact after delete: " + contactManageList.toString());
                    System.out.println("Contact delete success");
                } else if (!inputCharacter.equals(inputCharacter)) {
                    return;
                }
            }
        }
    }


    private static void lookUpContact() {
        int choose;
        boolean isExit = false;
        do {
            System.out.println("Select look up by" +
                    "\n1. The number phone" +
                    "\n2. Name" +
                    "\n3. Exit ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    byNumberPhone();
                    break;
                case 2:
                    byName();
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

    private static void byNumberPhone() {
        System.out.println("Enter the number need to find");
        scanner.nextLine();
        String numberPhone = scanner.nextLine();

        for (ContactManage contactManage : contactManageList) {
            if (numberPhone.equals(contactManage.getNumberPhone())) {
                System.out.println("Contact need to find: " + contactManage);
            }
        }

    }

    private static void byName() {
        System.out.println("Enter the name need to find");
        scanner.nextLine();
        String name = scanner.nextLine();

        for (ContactManage contactManage : contactManageList) {
            if (name.equals(contactManage.getName())) {
                System.out.println("Contact need to find: " + contactManage);
            }
        }
    }

    private static void readFileContact() {
        List<ContactManage> contactManageListNew = FileUtils.readFile();
        for (ContactManage contactManage : contactManageListNew) {
            System.out.println(contactManage);
        }
    }

    private static void writeFileContact() {
        FileUtils.writeFile(contactManageList, contactManage);
        System.out.println("Write file success ");
    }
}
