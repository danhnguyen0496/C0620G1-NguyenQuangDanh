package controllers;

import models.*;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static Scanner scanner = new Scanner(System.in);

    // menu cho phep nguoi dung lua chon cac chuc nang cua services
    public static void displayMainMenu() {
        System.out.print("Customer select content: " +
                "\n1. Add New Services " +
                "\n2. Show Services " +
                "\n3. Add New Customer " +
                "\n4. Show Information Of Customer " +
                "\n5. Add New Booking " +
                "\n6. Show Information Of Employee " +
                "\n7. Exit");
        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    Customer.addNewCustomer();
                    break;
                case 4:
                    Customer.readInformationCustomers();
                    Customer.showInformationCustomers();
                    break;
                case 5:
                    Booking.addNewBooking();
                    break;
                case 6:
                    Employee.showInformationOfEmployee();
                    break;
                case 7:
                    break;
            }
        } while (choice < 1 || choice > 7);
    }

    // menu nhap thong tin cho 1 dich vu thue bat ky (Villa, House, Room)
    public static void addNewServices() {
        System.out.print("Customer select content to enter the information: " +
                "\n1. Add New Villa " +
                "\n2. Add New House " +
                "\n3. Add New Room " +
                "\n4. Back to menu " +
                "\n5. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    WriteFileServices.addInForVilla();
                    break;
                case 2:
                    WriteFileServices.addInForHouse();
                    break;
                case 3:
                    WriteFileServices.addInForRoom();
                    break;
                case 4:
                    addNewServices();
                    break;
                case 5:
                    break;
            }
        } while (choice > 5 || choice < 1);
    }

    // menu hien thi thong tin dich vu
    public static void showServices() {
        System.out.print("Menu show services:" +
                "\n1. Show All Villa " +
                "\n2. Show All House " +
                "\n3. Show All Room " +
                "\n4. Show All Name Villa Not Duplicate" +
                "\n5. Show All Name House Not Duplicate " +
                "\n6. Show All Name Name Not Duplicate " +
                "\n7. Back to menu " +
                "\n8. Exit");

        int choice;
        do {
            System.out.print("\nEnter the choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ShowInfoServices.readInfoAllVilla();
                    ShowInfoServices.showAllVilla();
                    break;
                case 2:
                    ShowInfoServices.readInfoAllHouse();
                    ShowInfoServices.showAllHouse();
                    break;
                case 3:
                    ShowInfoServices.readInfoAllRoom();
                    ShowInfoServices.showAllRoom();
                    break;
                case 4:
                    ShowInfoServices.showAllNameVillaNotDuplicate();
                    displayMainMenu();
                    break;
                case 5:
                    ShowInfoServices.showAllNameHouseNotDuplicate();
                    displayMainMenu();
                    break;
                case 6:
                    ShowInfoServices.showAllNameRoomNotDuplicate();
                    displayMainMenu();
                    break;
                case 7:
                    showServices();
                    break;
                case 8:
                    break;
            }
        } while (choice < 1 || choice > 8);
    }
}
