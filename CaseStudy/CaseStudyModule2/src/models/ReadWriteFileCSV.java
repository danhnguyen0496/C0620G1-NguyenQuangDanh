package models;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFileCSV {

    public static Scanner scanner = new Scanner(System.in);
    public static final String COMMA = ", ";
    public static final String DOWN = "\n";

    public static Villa villa = new Villa();

    // nhap thong tin dich vu villa tu du lieu nguoi dung
    public static void inputInfoServicesVilla() {

        System.out.print("\nEnter the id: ");
        villa.setId(scanner.nextLine());
        System.out.print("\nEnter the ServiceName: ");
        villa.setServiceName(scanner.nextLine());
        System.out.print("\nEnter the AreaUse: ");
        villa.setAreaUse(scanner.nextFloat());
        System.out.print("\nEnter the RentalCosts: ");
        villa.setRentalCosts(scanner.nextFloat());
        System.out.print("\nEnter the MaxAmountPeople: ");
        villa.setMaxAmountPeople(scanner.nextInt());
        System.out.print("\nEnter the RentalType: ");
        scanner.skip("\\R");
        villa.setRentalType(scanner.nextLine());
        System.out.print("\nEnter the StandardRoom: ");
        villa.setStandardRoom(scanner.nextLine());
        System.out.print("\nEnter the DescribeAmenities: ");
        villa.setDescribeAmenities(scanner.nextLine());
        System.out.print("\nEnter the SwimmingPoolArea: ");
        villa.setSwimmingPoolArea(scanner.nextFloat());
        System.out.print("\nEnter the NumberFloors: ");
        villa.setNumberFloors(scanner.nextInt());
    }

    // ghi thong tin dich vu villa vao file villa.csv dang character
    public static void addInForVilla() {
        inputInfoServicesVilla();

        final String PATH_VILLA = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Villa.csv";
        final String FILE_HEADER = "Id, ServiceName, AreaUse, RentalCosts, MaxAmountPeople, RentalType, StandardRoom, DescribeAmenities, " +
                "SwimmingPoolArea, NumberFloors";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(new File(PATH_VILLA), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(DOWN).append(villa.getId()).append(COMMA).append(villa.getServiceName()).append(COMMA).append(villa.getAreaUse()).
                    append(COMMA).append(villa.getRentalCosts()).append(COMMA).append(villa.getMaxAmountPeople()).append(COMMA).
                    append(villa.getRentalType()).append(COMMA).append(villa.getStandardRoom()).append(COMMA).append(villa.getDescribeAmenities()).
                    append(COMMA).append(villa.getSwimmingPoolArea()).append(COMMA).append(villa.getNumberFloors()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static House house = new House();

    // nhap thong tin dich vu house tu du lieu nguoi dung
    public static void inputInfoServicesHouse() {
        System.out.print("\nEnter the id: ");
        house.setId(scanner.nextLine());
        System.out.print("\nEnter the ServiceName: ");
        house.setServiceName(scanner.nextLine());
        System.out.print("\nEnter the AreaUse: ");
        house.setAreaUse(scanner.nextFloat());
        System.out.print("\nEnter the RentalCosts: ");
        house.setRentalCosts(scanner.nextFloat());
        System.out.print("\nEnter the MaxAmountPeople: ");
        house.setMaxAmountPeople(scanner.nextInt());
        System.out.print("\nEnter the RentalType: ");
        scanner.skip("\\R");
        house.setRentalType(scanner.nextLine());
        System.out.print("\nEnter the StandardRoom: ");
        house.setStandardRoom(scanner.nextLine());
        System.out.print("\nEnter the DescribeAmenities: ");
        house.setDescribeAmenities(scanner.nextLine());
        System.out.print("\nEnter the NumberFloors:  ");
        house.setNumberFloors(scanner.nextInt());
    }

    // ghi thong tin dich vu house vao file house.csv dang character
    public static void addInForHouse() {
        inputInfoServicesHouse();

        final String PATH_HOUSE = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\House.csv";
        final String FILE_HEADER = "Id, ServiceName, AreaUse, RentalCosts, MaxAmountPeople, RentalType, StandardRoom, DescribeAmenities, NumberFloors";

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(new File(PATH_HOUSE), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(DOWN).append(house.getId()).append(COMMA).append(house.getServiceName()).append(COMMA).append(house.getAreaUse()).
                    append(COMMA).append(house.getRentalCosts()).append(COMMA).append(house.getMaxAmountPeople()).append(COMMA).
                    append(house.getRentalType()).append(COMMA).append(house.getStandardRoom()).append(COMMA).append(house.getDescribeAmenities()).
                    append(COMMA).append(house.getNumberFloors()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static Room room = new Room();

    // nhap thong tin dich vu room tu du lieu nguoi dung
    public static void inputInfoServicesRoom() {
        System.out.print("\nEnter the id: ");
        room.setId(scanner.nextLine());
        System.out.print("\nEnter the ServiceName: ");
        room.setServiceName(scanner.nextLine());
        System.out.print("\nEnter the AreaUse: ");
        room.setAreaUse(scanner.nextFloat());
        System.out.print("\nEnter the RentalCosts: ");
        room.setRentalCosts(scanner.nextFloat());
        System.out.print("\nEnter the MaxAmountPeople: ");
        room.setMaxAmountPeople(scanner.nextInt());
        System.out.print("\nEnter the RentalType: ");
        scanner.skip("\\R");
        room.setRentalType(scanner.nextLine());
        System.out.print("\nEnter the FreeServiceIncluded: ");
        room.setFreeServiceIncluded(scanner.nextLine());
    }

    // ghi thong tin dich vu room vao file room.csv dang character
    public static void addInForRoom() {
        inputInfoServicesRoom();

        final String PATH_ROOM = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Room.csv";
        final String FILE_HEADER = "Id, ServiceName, AreaUse, RentalCosts, MaxAmountPeople, RentalType, FreeServiceIncluded";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(new File(PATH_ROOM), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FILE_HEADER).append(DOWN).append(room.getId()).append(COMMA).append(room.getServiceName()).append(COMMA).append(room.getAreaUse()).
                    append(COMMA).append(room.getRentalCosts()).append(COMMA).append(room.getMaxAmountPeople()).append(COMMA).
                    append(room.getRentalType()).append(COMMA).append(room.getFreeServiceIncluded()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
