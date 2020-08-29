package commons;

import models.House;
import models.Room;
import models.Villa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckDataAddNewServices {

    //  kiem tra so thuc bang try catch
    public static Float checkFloat(String content, String error) {
        Scanner scanner;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(content);
                return scanner.nextFloat();
            } catch (Exception ex) {
                System.out.print(error);
            }
        }
    }

    //  kiem tra so nguyen bang try catch
    public static Integer checkInteger(String content, String error) {
        Scanner scanner;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(content);
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.print(error);
            }
        }
    }

    /**
     * check du lieu dau vao villa
     **/
    public static Villa checkDataVilla() {
        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);

        boolean isIdVilla;
        String ID = "^SVVL-\\d{4}$";
        System.out.print("Enter the id: ");
        do {
            String id = scanner.nextLine();
            isIdVilla = Pattern.matches(ID, id);
            if (isIdVilla) {
                villa.setId(id);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isIdVilla);


        boolean isServiceName;
        String NAME = "^[A-Z][^A-Z]+$";
        System.out.print("Enter the ServiceName: ");
        do {
            String serviceName = scanner.nextLine();
            isServiceName = Pattern.matches(NAME, serviceName);
            if (isServiceName) {
                villa.setServiceName(serviceName);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isServiceName);


        float areaUse = 0;
        do {
            areaUse = checkFloat("Enter the AreaUse: ", "Enter the number is not right, enter again" + "\n");
            if (areaUse > 30) {
                villa.setAreaUse(areaUse);
            } else {
                System.out.print("Enter the number less 30 is not right, enter again: ");
            }
        } while (areaUse <= 30);


        float rentalCosts;
        do {
            rentalCosts = checkFloat("Enter the RentalCosts: ", "Enter the number is not right, enter again" + "\n");
            if (rentalCosts > 0) {
                villa.setRentalCosts(rentalCosts);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (rentalCosts <= 0);


        boolean isMaxAmountPeople;
        String maxAmountPeople;
        String AMOUNT = "^([1-9]|([1][0-9]))$";
        System.out.print("Enter the MaxAmountPeople: ");
        do {
            maxAmountPeople = scanner.nextLine();
            isMaxAmountPeople = Pattern.matches(AMOUNT, maxAmountPeople);

            if (isMaxAmountPeople) {
                villa.setMaxAmountPeople(Integer.parseInt(maxAmountPeople));
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        String RENTAL = "^[A-Z][a-z]+$";
        System.out.print("Enter the RentalType: ");
        do {
            String rentalType = scanner.nextLine();
            isRentalType = Pattern.matches(RENTAL, rentalType);

            if (isRentalType) {
                villa.setRentalType(rentalType);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isRentalType);


        boolean isStandardRoom;
        String STANDARD = "^[A-Z][a-z]+$";
        System.out.print("Enter the StandardRoom: ");
        do {
            String standardRoom = scanner.nextLine();
            isStandardRoom = Pattern.matches(STANDARD, standardRoom);

            if (isStandardRoom) {
                villa.setStandardRoom(standardRoom);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isStandardRoom);


        boolean isDescribeAmenities;
        String DESCRIBE = "^[A-Z][a-z]+$";
        System.out.print("Enter the DescribeAmenities: ");
        do {
            String describeAmenities = scanner.nextLine();
            isDescribeAmenities = Pattern.matches(DESCRIBE, describeAmenities);

            if (isDescribeAmenities) {
                villa.setDescribeAmenities(describeAmenities);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isDescribeAmenities);


        float swimmingPoolArea;
        do {
            swimmingPoolArea = checkFloat("Enter the SwimmingPoolArea: ", "Enter the number is not right, enter again" + "\n");
            if (swimmingPoolArea > 30) {
                villa.setSwimmingPoolArea(swimmingPoolArea);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (swimmingPoolArea <= 30);


        int numberFloors;
        do {
            numberFloors = checkInteger("Enter the NumberFloors: ", "Enter the number is not right, enter again" + "\n");
            if (numberFloors > 0) {
                villa.setNumberFloors(numberFloors);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (numberFloors <= 0);


        return villa;
    }


    /**
     * check du lieu dau vao house
     **/
    public static House checkDataHouse() {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        boolean isIdHouse;
        String ID = "^SVHO-\\d{4}$";
        System.out.print("Enter the id: ");
        do {
            String id = scanner.nextLine();
            isIdHouse = Pattern.matches(ID, id);
            if (isIdHouse) {
                house.setId(id);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isIdHouse);


        boolean isServiceName;
        String NAME = "^[A-Z][^A-Z]+$";
        System.out.print("Enter the ServiceName: ");
        do {
            String serviceName = scanner.nextLine();
            isServiceName = Pattern.matches(NAME, serviceName);
            if (isServiceName) {
                house.setServiceName(serviceName);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isServiceName);


        float areaUse = 0;
        do {
            areaUse = checkFloat("Enter the AreaUse: ", "Enter the number is not right, enter again" + "\n");
            if (areaUse > 30) {
                house.setAreaUse(areaUse);
            } else {
                System.out.print("Enter the number less 30 is not right, enter again: ");
            }
        } while (areaUse <= 30);


        float rentalCosts;
        do {
            rentalCosts = checkFloat("Enter the RentalCosts: ", "Enter the number is not right, enter again" + "\n");
            if (rentalCosts > 0) {
                house.setRentalCosts(rentalCosts);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (rentalCosts <= 0);


        boolean isMaxAmountPeople;
        String maxAmountPeople;
        String AMOUNT = "^([1-9]|([1][0-9]))$";
        System.out.print("Enter the MaxAmountPeople: ");
        do {
            maxAmountPeople = scanner.nextLine();
            isMaxAmountPeople = Pattern.matches(AMOUNT, maxAmountPeople);

            if (isMaxAmountPeople) {
                house.setMaxAmountPeople(Integer.parseInt(maxAmountPeople));
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        String RENTAL = "^[A-Z][a-z]+$";
        System.out.print("Enter the RentalType: ");
        do {
            String rentalType = scanner.nextLine();
            isRentalType = Pattern.matches(RENTAL, rentalType);

            if (isRentalType) {
                house.setRentalType(rentalType);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isRentalType);


        boolean isStandardRoom;
        String STANDARD = "^[A-Z][a-z]+$";
        System.out.print("Enter the StandardRoom: ");
        do {
            String standardRoom = scanner.nextLine();
            isStandardRoom = Pattern.matches(STANDARD, standardRoom);

            if (isStandardRoom) {
                house.setStandardRoom(standardRoom);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isStandardRoom);


        boolean isDescribeAmenities;
        String DESCRIBE = "^[A-Z][a-z]+$";
        System.out.print("Enter the DescribeAmenities: ");
        do {
            String describeAmenities = scanner.nextLine();
            isDescribeAmenities = Pattern.matches(DESCRIBE, describeAmenities);

            if (isDescribeAmenities) {
                house.setDescribeAmenities(describeAmenities);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isDescribeAmenities);


        int numberFloors;
        do {
            numberFloors = checkInteger("Enter the NumberFloors: ", "Enter the number is not right, enter again" + "\n");
            if (numberFloors > 0) {
                house.setNumberFloors(numberFloors);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (numberFloors <= 0);

        return house;
    }

    /**
     * check du lieu dau vao room
     **/
    public static Room checkDataRoom() {
        Room room = new Room();
        Scanner scanner = new Scanner(System.in);

        boolean isIdRoom;
        String ID = "^SVRO-\\d{4}$";
        System.out.print("Enter the id: ");
        do {
            String id = scanner.nextLine();
            isIdRoom = Pattern.matches(ID, id);
            if (isIdRoom) {
                room.setId(id);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isIdRoom);


        boolean isServiceName;
        String NAME = "^[A-Z][^A-Z]+$";
        System.out.print("Enter the ServiceName: ");
        do {
            String serviceName = scanner.nextLine();
            isServiceName = Pattern.matches(NAME, serviceName);
            if (isServiceName) {
                room.setServiceName(serviceName);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isServiceName);


        float areaUse = 0;
        do {
            areaUse = checkFloat("Enter the AreaUse: ", "Enter the number is not right, enter again" + "\n");
            if (areaUse > 30) {
                room.setAreaUse(areaUse);
            } else {
                System.out.print("Enter the number less 30 is not right, enter again: ");
            }
        } while (areaUse <= 30);


        float rentalCosts;
        do {
            rentalCosts = checkFloat("Enter the RentalCosts: ", "Enter the number is not right, enter again" + "\n");
            if (rentalCosts > 0) {
                room.setRentalCosts(rentalCosts);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (rentalCosts <= 0);


        boolean isMaxAmountPeople;
        String maxAmountPeople;
        String AMOUNT = "^([1-9]|([1][0-9]))$";
        System.out.print("Enter the MaxAmountPeople: ");
        do {
            maxAmountPeople = scanner.nextLine();
            isMaxAmountPeople = Pattern.matches(AMOUNT, maxAmountPeople);

            if (isMaxAmountPeople) {
                room.setMaxAmountPeople(Integer.parseInt(maxAmountPeople));
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        String RENTAL = "^[A-Z][a-z]+$";
        System.out.print("Enter the RentalType: ");
        do {
            String rentalType = scanner.nextLine();
            isRentalType = Pattern.matches(RENTAL, rentalType);

            if (isRentalType) {
                room.setRentalType(rentalType);
            } else {
                System.out.print("Input the information is not right, input again: ");
            }
        } while (!isRentalType);

        boolean isFreeServiceIncluded;
        do {
            System.out.print("\nEnter the FreeServiceIncluded: ");
            String freeServiceIncluded = scanner.nextLine();
            final String FREE_SERVICES_ROOM = "^(massage|karaoke|food|drink|car)$";
            isFreeServiceIncluded = Pattern.matches(FREE_SERVICES_ROOM, freeServiceIncluded);

            if (isFreeServiceIncluded) {
                room.setFreeServiceIncluded(freeServiceIncluded);
            } else {
                System.out.println("Input the information not right, you can input again: ");
            }
        } while (!isFreeServiceIncluded);

        return room;
    }
}
