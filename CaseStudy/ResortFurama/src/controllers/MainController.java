package controllers;

import commons.FileUtils;
import commons.Validates;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit = false;
    private static String VILLA = "Villa";
    private static String HOUSE = "House";
    private static String ROOM = "Room";
    private static String CUSTOMER = "Customer";

    // menu hiện thị giao diện chính
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
                    addNewCustomer(CUSTOMER);
                    break;
                case 4:
                    showInformationCustomer(CUSTOMER);
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

    // menu hiện thị thêm dịch vụ
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

    // hàm thêm dịch vụ
    private static void addNewServices(String fileName) {

        String id;
        System.out.println("Enter the id service:");
        do {
            scanner.nextLine();
            id = scanner.nextLine();
        } while (!Validates.isIdServices(id));

        String nameServices;
        System.out.println("Enter the name services: ");
        do {
            nameServices = scanner.nextLine();
        } while (!Validates.isServices(nameServices));

        double areaUse;
        System.out.println("Enter the area use services: ");
        do {
            areaUse = scanner.nextDouble();
        } while (!Validates.isArea(areaUse, 30));

        double rentCost;
        System.out.println("Enter the rent cost services: ");
        do {
            rentCost = scanner.nextDouble();
        } while (!Validates.isRentCost(rentCost));

        int maxNumberPeople;
        System.out.println("Enter the max number people use services: ");
        do {
            maxNumberPeople = scanner.nextInt();
        } while (!Validates.isMaxNumberPeople(maxNumberPeople, 0, 20));

        String rentType;
        System.out.println("Enter the rent type services: ");
        do {
            scanner.nextLine();
            rentType = scanner.nextLine();
        } while (!Validates.isServices(rentType));

        if (fileName.equals(VILLA)) {

            String standardRoom;
            System.out.println("Enter the standard room: ");
            do {
                standardRoom = scanner.nextLine();
            } while (!Validates.isServices(standardRoom));

            String convenientDescription;
            System.out.println("Enter the convenient description:");
            do {
                convenientDescription = scanner.nextLine();
            } while (!Validates.isServices(convenientDescription));

            double areaPool;
            System.out.println("Enter the area pool:");
            do {
                areaPool = scanner.nextDouble();
            } while (!Validates.isArea(areaPool, 30));

            int numberFloor;
            System.out.println("Enter the number floor:");
            do {
                numberFloor = scanner.nextInt();
            } while (!Validates.isNumberFloor(numberFloor));

            FileUtils.setPath(VILLA);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, standardRoom, convenientDescription, String.valueOf(areaPool), String.valueOf(numberFloor)});
        } else if (fileName.equals(HOUSE)) {

            String standardRoom;
            System.out.println("Enter the standard room: ");
            do {
                standardRoom = scanner.nextLine();
            } while (!Validates.isServices(standardRoom));

            String convenientDescription;
            System.out.println("Enter the convenient description:");
            do {
                convenientDescription = scanner.nextLine();
            } while (!Validates.isServices(convenientDescription));

            int numberFloor;
            System.out.println("Enter the number floor:");
            do {
                numberFloor = scanner.nextInt();
            } while (!Validates.isNumberFloor(numberFloor));

            FileUtils.setPath(HOUSE);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, standardRoom, convenientDescription, String.valueOf(numberFloor)});
        } else if (fileName.equals(ROOM)) {

            String nameExtraServices;
            System.out.println("Enter the name extra services:");
            do {
                nameExtraServices = scanner.nextLine();
            } while (!Validates.isAccompanyServices(nameExtraServices));

            System.out.println("Enter the unit:");
            String unit = scanner.nextLine();
            System.out.println("Enter the price:");
            double price = scanner.nextDouble();
            FileUtils.setPath(ROOM);
            FileUtils.writeFile(new String[]{id, nameServices, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxNumberPeople),
                    rentType, nameExtraServices, unit, String.valueOf(price)});
        }
    }

    // menu hiện thị thông tin dịch vụ
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
                    showAllNameServicesNotDuplicate(VILLA);
                    break;
                case 5:
                    showAllNameServicesNotDuplicate(HOUSE);
                    break;
                case 6:
                    showAllNameServicesNotDuplicate(ROOM);
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

    // hàm đọc file csv kiểu dữ liệu string chuyển sang lưu kiểu dữ liệu đối tượng services
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

    // hàm hiện thị tât cả thông tin dịch vụ
    private static void showAllServices(String fileName) {
        List<Services> services = readServices(fileName);
        int i = 1;
        for (Services service : services) {
            System.out.print(fileName + " " + i + " : ");
            service.showInfo();
            i++;
        }
    }

    // hàm hiện thị tên dịch vụ không trùng lặp
    private static void showAllNameServicesNotDuplicate(String fileName) {
        List<Services> services = readServices(fileName);
        TreeSet<String> servicesTreeSet = new TreeSet<>();

        for (Services service : services) {
            servicesTreeSet.add(service.getNameService());
        }

        int i = 1;
        System.out.println("Display name services not duplicate: ");
        for (String nameServicesNotDuplicate : servicesTreeSet) {
            System.out.println(fileName + " " + i + " : " + nameServicesNotDuplicate);
            i++;
        }
    }

    // ham them thong tin khach hang
    private static void addNewCustomer(String fileName) {

        System.out.print("Enter the name: ");
        scanner.nextLine();
        String name = Validates.nameException();


        System.out.print("Enter the birthday: ");
        String birthday = scanner.nextLine();

        System.out.print("Enter the gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter the identify card number: ");
        String identifyCardNumber = scanner.nextLine();

        System.out.print("Enter the number phone: ");
        String numberPhone = scanner.nextLine();

        System.out.print("Enter the email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the customer type: ");
        String customerType = scanner.nextLine();

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();

        FileUtils.setPath(fileName);
        FileUtils.writeFile(new String[]{name, birthday, gender, identifyCardNumber, numberPhone, email, customerType, address});

    }

    private static List<Customer> readAllCustomer(String fileName) {
        FileUtils.setPath(fileName);
        List<String> propertiesCustomerList = FileUtils.readFile();
        List<Customer> customerList = new ArrayList<>();

        String[] propertiesElement;
        Customer customer = new Customer();
        for (String properties : propertiesCustomerList) {
            propertiesElement = properties.split(",");
            customer.setName(propertiesElement[0]);
            customer.setBirthday(propertiesElement[1]);
            customer.setGender(propertiesElement[2]);
            customer.setIdentityCardNumber(propertiesElement[3]);
            customer.setNumberPhone(propertiesElement[4]);
            customer.setEmail(propertiesElement[5]);
            customer.setCustomerType(propertiesElement[6]);
            customer.setAddress(propertiesElement[7]);
        }
        customerList.add(customer);

        return customerList;
    }

    private static void showInformationCustomer(String fileName) {
        List<Customer> customerList = readAllCustomer(fileName);
        int i = 1;
        for (Customer customer : customerList) {
            System.out.print(fileName + " " + i + " : ");
            customer.showInfo();
            i++;
        }
    }

    private static void addNewBooking() {
    }

    private static void showInformationEmployee() {
    }
}
