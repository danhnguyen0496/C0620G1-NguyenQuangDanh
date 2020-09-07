package controllers;

import commons.FileUtils;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit = false;
    private static String VILLA = "Villa";
    private static String HOUSE = "House";
    private static String ROOM = "Room";

    public static void displayMainMenu() {
        int choose;
        do {
            System.out.println("--- List menu ---\n" +
                    "1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit");
            System.out.println("Enter the select function: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationEmployee();
                    break;
                case 7:
                    isExit = true;
                    break;
            }
            if (isExit) {
                break;
            }
        }
        while (choose >= 1 && choose <= 7);
    }

    private static void addNewServices() {
        int choose;
        do {
            System.out.println("--- Select service --- \n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit");
            System.out.println("Enter the select service: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices(VILLA);
                    break;
                case 2:
                    addNewServices(HOUSE);
                    break;
                case 3:
                    addNewServices(ROOM);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    isExit = true;
                    break;
            }
            if (isExit) {
                return;
            }
        } while (choose >= 1 && choose <= 5);
    }

    private static void addNewServices(String fileName) {
        System.out.println("Enter the id service:");
        scanner.nextLine();
        String id = scanner.nextLine();
        System.out.println("Enter the name services: ");
        String nameServices = scanner.nextLine();
        System.out.println("Enter the area use services: ");
        double areaUse = scanner.nextDouble();
        System.out.println("Enter the rent cost services: ");
        double rentCost = scanner.nextDouble();
        System.out.println("Enter the max number people use services: ");
        int maxNumberPeople = scanner.nextInt();
        System.out.println("Enter the rent type services: ");
        scanner.nextLine();
        String rentType = scanner.nextLine();

        if (fileName.equals(VILLA)) {
            System.out.println("Enter the standard room: ");
            String standardRoom = scanner.nextLine();
            System.out.println("Enter the convenient description:");
            String convenientDescription = scanner.nextLine();
            System.out.println("Enter the area pool:");
            double areaPool = scanner.nextDouble();
            System.out.println("Enter the number floor:");
            int numberFloor = scanner.nextInt();
            FileUtils.setPath(VILLA);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, standardRoom, convenientDescription, String.valueOf(areaPool), String.valueOf(numberFloor)});
        } else if (fileName.equals(HOUSE)) {
            System.out.println("Enter the standard room: ");
            String standardRoom = scanner.nextLine();
            System.out.println("Enter the convenient description:");
            String convenientDescription = scanner.nextLine();
            System.out.println("Enter the area pool:");
            int numberFloor = scanner.nextInt();
            FileUtils.setPath(HOUSE);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, standardRoom, convenientDescription, String.valueOf(numberFloor)});
        } else if (fileName.equals(ROOM)) {
            System.out.println("Enter the name extra services:");
            String nameExtraServices = scanner.nextLine();
            System.out.println("Enter the unit:");
            String unit = scanner.nextLine();
            System.out.println("Enter the price:");
            double price = scanner.nextDouble();
            FileUtils.setPath(ROOM);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, nameExtraServices, unit, String.valueOf(price)});
        }
    }

    private static void showServices() {
        int choose;
        do {
            System.out.println("--- Display services ---\n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit");
            System.out.println("Enter the select display services: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllServices(VILLA);
                    break;
                case 2:
                    showAllServices(HOUSE);
                    break;
                case 3:
                    showAllServices(ROOM);
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    displayMainMenu();
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

    private static List<Services> readServices(String fileName) {
        FileUtils.setPath(fileName);
        List<String> propertiesServicesList = FileUtils.readFile();

        List<Services> servicesList = new ArrayList<>();
        String[] propertiesElement = null;
        Services services = null;
        for (String properties : propertiesServicesList) {
            propertiesElement = properties.split(FileUtils.COMMA);
            if (fileName.equals(VILLA)) {
                services = new Villa();
                ((Villa) services).setStandardRoom(propertiesElement[6]);
                ((Villa) services).setConvenientDescription(propertiesElement[7]);
                ((Villa) services).setAreaPool(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberFloor(Integer.parseInt(propertiesElement[9]));
            } else if (fileName.equals(HOUSE)) {
                services = new House();
                ((House) services).setStandardRoom(propertiesElement[6]);
                ((House) services).setConvenientDescription(propertiesElement[7]);
                ((House) services).setNumberFloor(Integer.parseInt(propertiesElement[8]));
            } else if (fileName.equals(ROOM)) {
                ExtraServices extraServices = new ExtraServices(propertiesElement[6], propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setExtraServices(extraServices);
            }

            services.setId(propertiesElement[0]);
            services.setNameService(propertiesElement[1]);
            services.setAreaUse(Double.parseDouble(propertiesElement[2]));
            services.setRentCost(Double.parseDouble(propertiesElement[3]));
            services.setMaxNumberPeople(Integer.parseInt(propertiesElement[4]));
            services.setRentType(propertiesElement[5]);
            servicesList.add(services);
        }
        return servicesList;
    }

    private static void showAllServices(String fileName) {
        List<Services> services = readServices(fileName);
        for (Services service : services) {
            service.showInfo();
        }
    }

    private static void addNewCustomer() {
    }

    private static void showInformationCustomer() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationEmployee() {
    }
}
