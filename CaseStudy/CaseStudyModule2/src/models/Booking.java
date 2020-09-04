package models;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Booking {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = Customer.readInformationCustomers();

    public static void addNewBooking() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i).showInfo());
        }
        Customer customer = choiceCustomer();
        int choice;
        System.out.print("Enter the select booking: " +
                "\n1. Booking Villa" +
                "\n2. Booking House" +
                "\n3. Booking Room");
        do {
            System.out.print("\nEnter the choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookingVilla(customer);
                    break;
                case 2:
                    bookingHouse(customer);
                    break;
                case 3:
                    bookingRoom(customer);
                    break;
            }
        } while (choice > 3 || choice < 1);
    }

    public static Customer choiceCustomer() {
        // hien thi danh sach khach hang can chon dich vu
        int choice = -1;
        Customer customer = null;
        while (choice < 1 || choice > customerList.size()) {
            System.out.print("Select the customer to booking services: \nCustomer ");
            choice = scanner.nextInt();
        }
        for (int i = 1; i <= customerList.size(); i++) {
            if (i == choice) {
                customer = customerList.get(i - 1);
                System.out.println(customerList.get(i - 1).showInfo());
            }
        }
        return customer;
    }

    public static String PATH_BOOKING = "src/data/Booking.csv";

    public static void bookingVilla(Customer customer) {
        ArrayList arrayList = (ArrayList) ShowInfoServices.readInfoAllVilla();
        ShowInfoServices.showAllVilla();
        System.out.print("Select villa to booking, villa ");
        int choiceVilla = scanner.nextInt();
        Services services = (Services) arrayList.get(choiceVilla - 1);
        customer.setServices(services);
        final String DOWN = "\n";
        final String COMMA = ", ";
        try {
            FileWriter fileWriter = new FileWriter(new File(PATH_BOOKING), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(customer.getName()).append(COMMA).append(customer.getBirthday()).append(COMMA).
                    append(customer.getGender()).append(COMMA).append(customer.getIdentityCardNumber()).append(COMMA).
                    append(customer.getNumberPhone()).append(COMMA).append(customer.getEmail()).append(COMMA).
                    append(customer.getCustomerType()).append(COMMA).append(customer.getAddress()).
                    append(COMMA).append(customer.getServices().getId()).append(COMMA).append(customer.getServices().getServiceName()).
                    append(COMMA).append(customer.getServices().getAreaUse()).append(COMMA).append(customer.getServices().getRentalCosts()).
                    append(COMMA).append(customer.getServices().getMaxAmountPeople()).append(COMMA).append(customer.getServices().getRentalType())
                    .append(DOWN);

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bookingHouse(Customer customer) {
        ArrayList arrayList = (ArrayList) ShowInfoServices.readInfoAllHouse();
        ShowInfoServices.showAllHouse();
        System.out.print("Select villa to booking, house ");
        int choiceHouse = scanner.nextInt();
        Services services = (Services) arrayList.get(choiceHouse - 1);
        customer.setServices(services);
        final String DOWN = "\n";
        final String COMMA = ", ";
        try {
            FileWriter fileWriter = new FileWriter(new File(PATH_BOOKING), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(customer.getName()).append(COMMA).append(customer.getBirthday()).append(COMMA).
                    append(customer.getGender()).append(COMMA).append(customer.getIdentityCardNumber()).append(COMMA).
                    append(customer.getNumberPhone()).append(COMMA).append(customer.getEmail()).append(COMMA).
                    append(customer.getCustomerType()).append(COMMA).append(customer.getAddress()).append(COMMA).
                    append(COMMA).append(customer.getServices().getId()).append(COMMA).append(customer.getServices().getServiceName()).
                    append(COMMA).append(customer.getServices().getAreaUse()).append(COMMA).append(customer.getServices().getRentalCosts()).
                    append(COMMA).append(customer.getServices().getMaxAmountPeople()).append(COMMA).append(customer.getServices().getRentalType()).
                    append(DOWN);

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bookingRoom(Customer customer) {
        ArrayList arrayList = (ArrayList) ShowInfoServices.readInfoAllRoom();
        ShowInfoServices.showAllRoom();
        System.out.print("Select villa to booking, room ");
        int choiceRoom = scanner.nextInt();
        Services services = (Services) arrayList.get(choiceRoom - 1);
        customer.setServices(services);
        final String DOWN = "\n";
        final String COMMA = ", ";
        try {
            FileWriter fileWriter = new FileWriter(new File(PATH_BOOKING), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(customer.getName()).append(COMMA).append(customer.getBirthday()).append(COMMA).
                    append(customer.getGender()).append(COMMA).append(customer.getIdentityCardNumber()).append(COMMA).
                    append(customer.getNumberPhone()).append(COMMA).append(customer.getEmail()).append(COMMA).
                    append(customer.getCustomerType()).append(COMMA).append(customer.getAddress()).append(COMMA).
                    append(COMMA).append(customer.getServices().getId()).append(COMMA).append(customer.getServices().getServiceName()).
                    append(COMMA).append(customer.getServices().getAreaUse()).append(COMMA).append(customer.getServices().getRentalCosts()).
                    append(COMMA).append(customer.getServices().getMaxAmountPeople()).append(COMMA).append(customer.getServices().getRentalType()).
                    append(DOWN);

            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
