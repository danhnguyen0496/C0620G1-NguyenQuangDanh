package views;

import models.House;
import models.Room;
import models.Villa;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInputDataAddNewServices {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * check du lieu dau vao villa
     **/
    public static void checkDataVilla() {
        Villa villa = new Villa();

        boolean isIdVilla;
        do {
            System.out.print("\nEnter the id: ");
            String id = scanner.nextLine();
            final String ID_VILLA = "^SVVL-\\d{4}$";
            isIdVilla = Pattern.matches(ID_VILLA, id);
            if (isIdVilla) {
                villa.setId(id);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                id = scanner.nextLine();
                isIdVilla = Pattern.matches(ID_VILLA, id);
            }
        } while (!isIdVilla);


        boolean isServiceName;
        do {
            System.out.print("\nEnter the ServiceName: ");
            String serviceName = scanner.nextLine();
            final String NAME_VILLA = "^[A-Z][^A-Z]+$";
            isServiceName = Pattern.matches(NAME_VILLA, serviceName);
            if (isServiceName) {
                villa.setServiceName(serviceName);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                serviceName = scanner.nextLine();
                isServiceName = Pattern.matches(NAME_VILLA, serviceName);
            }
        } while (!isServiceName);


        float areaUse = 0;
        while (areaUse <= 30) {
            try {
                System.out.print("\nEnter the AreaUse: ");
                areaUse = scanner.nextFloat();
                villa.setAreaUse(areaUse);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                areaUse = scanner.nextFloat();
                villa.setAreaUse(areaUse);
            }
        }


        float rentalCosts = -1;
        while (rentalCosts < 0) {
            try {
                System.out.print("\nEnter the RentalCosts: ");
                rentalCosts = scanner.nextFloat();
                villa.setRentalCosts(rentalCosts);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                scanner.skip("\\R");
                rentalCosts = scanner.nextFloat();
                villa.setRentalCosts(rentalCosts);
            }
        }


        boolean isMaxAmountPeople;
        do {
            final String AMOUNT_VILLA = "^([1-9]|([1][0-9]))$";
            int maxAmountPeople;
            try {
                System.out.print("\nEnter the MaxAmountPeople: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_VILLA, String.valueOf(maxAmountPeople));

                if (isMaxAmountPeople) {
                    villa.setMaxAmountPeople(maxAmountPeople);
                } else {
                    System.out.println("Input the information not right, you can input again: ");
                    maxAmountPeople = scanner.nextInt();
                    isMaxAmountPeople = Pattern.matches(AMOUNT_VILLA, String.valueOf(maxAmountPeople));
                }
            } catch (InputMismatchException e) {
                System.err.print("Enter not right, enter again: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_VILLA, String.valueOf(maxAmountPeople));
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        do {
            System.out.print("\nEnter the RentalType: ");
            scanner.skip("\\R");
            String rentalType = scanner.nextLine();
            final String RENTAL_VILLA = "^[A-Z][a-z]+$";
            isRentalType = Pattern.matches(RENTAL_VILLA, rentalType);

            if (isRentalType) {
                villa.setRentalType(rentalType);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                rentalType = scanner.nextLine();
                isRentalType = Pattern.matches(RENTAL_VILLA, rentalType);
            }
        } while (!isRentalType);

        boolean isStandardRoom;
        do {
            System.out.print("\nEnter the StandardRoom: ");
            String standardRoom = scanner.nextLine();
            final String STANDARD_ROOM_VILLA = "^[A-Z][a-z]+$";
            isStandardRoom = Pattern.matches(STANDARD_ROOM_VILLA, standardRoom);
            if (isStandardRoom) {
                villa.setStandardRoom(standardRoom);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                standardRoom = scanner.nextLine();
                isStandardRoom = Pattern.matches(STANDARD_ROOM_VILLA, standardRoom);
            }
        } while (!isStandardRoom);

        boolean isDescribeAmenities;
        do {
            System.out.print("\nEnter the DescribeAmenities: ");
            String describeAmenities = scanner.nextLine();
            final String DESCRIBE_VILLA = "^[A-Z][a-z]+$";
            isDescribeAmenities = Pattern.matches(DESCRIBE_VILLA, describeAmenities);

            if (isDescribeAmenities) {
                villa.setDescribeAmenities(describeAmenities);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                describeAmenities = scanner.nextLine();
                isDescribeAmenities = Pattern.matches(DESCRIBE_VILLA, describeAmenities);
            }
        } while (!isDescribeAmenities);


        float swimmingPoolArea = 0;
        while (swimmingPoolArea <= 30) {
            try {
                System.out.print("\nEnter the SwimmingPoolArea: ");
                swimmingPoolArea = scanner.nextFloat();
                villa.setSwimmingPoolArea(swimmingPoolArea);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                swimmingPoolArea = scanner.nextFloat();
                villa.setSwimmingPoolArea(swimmingPoolArea);
            }
        }

        int numberFloors;
        do {
            System.out.print("\nEnter the NumberFloors: ");
            numberFloors = scanner.nextInt();
        } while (numberFloors <= 0);
        villa.setNumberFloors(numberFloors);

    }


    /**
     * check du lieu dau vao house
     **/
    public static void checkDataHouse() {
        House house = new House();

        boolean isIdHouse;
        do {
            System.out.print("\nEnter the id: ");
            String id = scanner.nextLine();
            final String ID_HOUSE = "^SVHO-\\d{4}$";
            isIdHouse = Pattern.matches(ID_HOUSE, id);
            if (isIdHouse) {
                house.setId(id);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                id = scanner.nextLine();
                isIdHouse = Pattern.matches(ID_HOUSE, id);
            }
        } while (!isIdHouse);


        boolean isServiceName;
        do {
            System.out.print("\nEnter the ServiceName: ");
            String serviceName = scanner.nextLine();
            final String NAME_HOUSE = "^[A-Z][^A-Z]+$";
            isServiceName = Pattern.matches(NAME_HOUSE, serviceName);
            if (isServiceName) {
                house.setServiceName(serviceName);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                serviceName = scanner.nextLine();
                isServiceName = Pattern.matches(NAME_HOUSE, serviceName);
            }
        } while (!isServiceName);


        float areaUse = 0;
        while (areaUse <= 30) {
            try {
                System.out.print("\nEnter the AreaUse: ");
                areaUse = scanner.nextFloat();
                house.setAreaUse(areaUse);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                areaUse = scanner.nextFloat();
                house.setAreaUse(areaUse);
            }
        }


        float rentalCosts = -1;
        while (rentalCosts < 0) {
            try {
                System.out.print("\nEnter the RentalCosts: ");
                rentalCosts = scanner.nextFloat();
                house.setRentalCosts(rentalCosts);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                rentalCosts = scanner.nextFloat();
                house.setRentalCosts(rentalCosts);
            }
        }


        boolean isMaxAmountPeople;
        do {
            final String AMOUNT_HOUSE = "^([1-9]|([1][0-9]))$";
            int maxAmountPeople;
            try {
                System.out.print("\nEnter the MaxAmountPeople: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_HOUSE, String.valueOf(maxAmountPeople));

                if (isMaxAmountPeople) {
                    house.setMaxAmountPeople(maxAmountPeople);
                } else {
                    System.out.println("Input the information not right, you can input again: ");
                    maxAmountPeople = scanner.nextInt();
                    isMaxAmountPeople = Pattern.matches(AMOUNT_HOUSE, String.valueOf(maxAmountPeople));
                }
            } catch (InputMismatchException e) {
                System.err.print("Enter not right, enter again: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_HOUSE, String.valueOf(maxAmountPeople));
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        do {
            System.out.print("\nEnter the RentalType: ");
            scanner.skip("\\R");
            String rentalType = scanner.nextLine();
            final String RENTAL_HOUSE = "^[A-Z][a-z]+$";
            isRentalType = Pattern.matches(RENTAL_HOUSE, rentalType);

            if (isRentalType) {
                house.setRentalType(rentalType);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                rentalType = scanner.nextLine();
                isRentalType = Pattern.matches(RENTAL_HOUSE, rentalType);
            }
        } while (!isRentalType);

        boolean isStandardRoom;
        do {
            System.out.print("\nEnter the StandardRoom: ");
            String standardRoom = scanner.nextLine();
            final String STANDARD_ROOM_HOUSE = "^[A-Z][a-z]+$";
            isStandardRoom = Pattern.matches(STANDARD_ROOM_HOUSE, standardRoom);
            if (isStandardRoom) {
                house.setStandardRoom(standardRoom);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                standardRoom = scanner.nextLine();
                isStandardRoom = Pattern.matches(STANDARD_ROOM_HOUSE, standardRoom);
            }
        } while (!isStandardRoom);

        boolean isDescribeAmenities;
        do {
            System.out.print("\nEnter the DescribeAmenities: ");
            String describeAmenities = scanner.nextLine();
            final String DESCRIBE_HOUSE = "^[A-Z][a-z]+$";
            isDescribeAmenities = Pattern.matches(DESCRIBE_HOUSE, describeAmenities);

            if (isDescribeAmenities) {
                house.setDescribeAmenities(describeAmenities);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                describeAmenities = scanner.nextLine();
                isDescribeAmenities = Pattern.matches(DESCRIBE_HOUSE, describeAmenities);
            }
        } while (!isDescribeAmenities);

        int numberFloors;
        do {
            System.out.print("\nEnter the NumberFloors: ");
            numberFloors = scanner.nextInt();
        } while (numberFloors <= 0);
        house.setNumberFloors(numberFloors);

    }

    /**
     * check du lieu dau vao room
     **/
    public static void checkDataRoom() {
        Room room = new Room();

        boolean isIdRoom;
        do {
            System.out.print("\nEnter the id: ");
            String id = scanner.nextLine();
            final String ID_ROOM = "^SVRO-\\d{4}$";
            isIdRoom = Pattern.matches(ID_ROOM, id);
            if (isIdRoom) {
                room.setId(id);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                id = scanner.nextLine();
                isIdRoom = Pattern.matches(ID_ROOM, id);
            }
        } while (!isIdRoom);


        boolean isServiceName;
        do {
            System.out.print("\nEnter the ServiceName: ");
            String serviceName = scanner.nextLine();
            final String NAME_ROOM = "^[A-Z][^A-Z]+$";
            isServiceName = Pattern.matches(NAME_ROOM, serviceName);
            if (isServiceName) {
                room.setServiceName(serviceName);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                serviceName = scanner.nextLine();
                isServiceName = Pattern.matches(NAME_ROOM, serviceName);
            }
        } while (!isServiceName);


        float areaUse = 0;
        while (areaUse <= 30) {
            try {
                System.out.print("\nEnter the AreaUse: ");
                areaUse = scanner.nextFloat();
                room.setAreaUse(areaUse);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                areaUse = scanner.nextFloat();
                room.setAreaUse(areaUse);
            }
        }


        float rentalCosts = -1;
        while (rentalCosts < 0) {
            try {
                System.out.print("\nEnter the RentalCosts: ");
                rentalCosts = scanner.nextFloat();
                room.setRentalCosts(rentalCosts);
            } catch (InputMismatchException e) {
                System.err.print("Enter is not number, enter again: ");
                rentalCosts = scanner.nextFloat();
                room.setRentalCosts(rentalCosts);
            }
        }


        boolean isMaxAmountPeople;
        do {
            final String AMOUNT_ROOM = "^([1-9]|([1][0-9]))$";
            int maxAmountPeople;
            try {
                System.out.print("\nEnter the MaxAmountPeople: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_ROOM, String.valueOf(maxAmountPeople));

                if (isMaxAmountPeople) {
                    room.setMaxAmountPeople(maxAmountPeople);
                } else {
                    System.out.println("Input the information not right, you can input again: ");
                    maxAmountPeople = scanner.nextInt();
                    isMaxAmountPeople = Pattern.matches(AMOUNT_ROOM, String.valueOf(maxAmountPeople));
                }
            } catch (InputMismatchException e) {
                System.err.print("Enter not right, enter again: ");
                maxAmountPeople = scanner.nextInt();
                isMaxAmountPeople = Pattern.matches(AMOUNT_ROOM, String.valueOf(maxAmountPeople));
            }
        } while (!isMaxAmountPeople);


        boolean isRentalType;
        do {
            System.out.print("\nEnter the RentalType: ");
            scanner.skip("\\R");
            String rentalType = scanner.nextLine();
            final String RENTAL_ROOM = "^[A-Z][a-z]+$";
            isRentalType = Pattern.matches(RENTAL_ROOM, rentalType);

            if (isRentalType) {
                room.setRentalType(rentalType);
            } else {
                System.out.println("Input the information not right, you can input again: ");
                rentalType = scanner.nextLine();
                isRentalType = Pattern.matches(RENTAL_ROOM, rentalType);
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
                freeServiceIncluded = scanner.nextLine();
                isFreeServiceIncluded = Pattern.matches(FREE_SERVICES_ROOM, freeServiceIncluded);
            }
        } while (!isFreeServiceIncluded);
    }
}
