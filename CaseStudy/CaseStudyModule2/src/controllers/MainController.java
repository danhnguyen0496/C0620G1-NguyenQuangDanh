package controllers;

import models.ReadWriteFileCSV;
import models.ShowServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static Scanner scanner = new Scanner(System.in);

    // hien thi menu, cho phep nguoi dung lua chon cac chuc nang cua menu
    public static void displayMainMenu() {
        System.out.print("Customer select content: \n1. Add New Services \n2. Show Services \n3. Add New Customer " +
                "\n4. Show Information of Customer \n5. Add New Booking \n6. Show Information of Employee \n7. Exit");

        int choice = 0;
        try {
            while (choice > 7 || choice < 1) {
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.print("You must enter the number");
        }
        switch (choice) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
//            case 3:
//                addNewCustomer();
//                break;
//            case 4:
//                showInformationCustomers();
//                break;
//            case 5:
//                addNewBooking();
//                break;
//            case 6:
//                showInformationOfEmployee();
//                break;
            case 7:
                break;
        }
    }

    // nhap thong tin cho 1 dich vu thue bat ky (Villa, House, Room)
    public static void addNewServices() {
        System.out.print("Customer select content to enter the information: \n1. Add New Villa \n2. Add New House " +
                "\n3. Add New Room \n4. Back to menu \n5. Exit");

        int choice = 0;
        try {
            while (choice > 5 || choice < 1) {
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.print("You must enter the number");
        }
        switch (choice) {
            case 1:
                ReadWriteFileCSV.addInForVilla();
                break;
            case 2:
                ReadWriteFileCSV.addInForHouse();
                break;
            case 3:
                ReadWriteFileCSV.addInForRoom();
                break;
            case 4:
                addNewServices();
                break;
            case 5:
                break;
        }
    }

    // hien thi thong tin dich vu
    public static void showServices() {
        System.out.print("Menu show services:\n1. Show All Villa \n2. Show All House \n3. Show All Room \n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate \n6. Show All Name Name Not Duplicate \n7. Back to menu \n8. Exit");

        int choice = 0;
        try {
            while (choice < 1 || choice > 8) {
                System.out.print("\nEnter the choice: ");
                choice = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.print("You must enter the number");
        }
        switch (choice) {
            case 1:
                ShowServices.showAllVilla();
                break;
            case 2:
                ShowServices.showAllHouse();
                break;
            case 3:
                ShowServices.showAllRoom();
                break;
//            case 4:
//                showAllNameVillaNotDuplicate();
//                break;
//            case 5:
//                showAllNameHouseNotDuplicate();
//                break;
//            case 6:
//                showAllNameRoomNotDuplicate();
//                break;
            case 7:
                showServices();
                break;
            case 8:
                break;
        }
    }
}
