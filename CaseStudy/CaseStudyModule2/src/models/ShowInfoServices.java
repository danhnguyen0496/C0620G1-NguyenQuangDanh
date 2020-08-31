package models;

import java.io.*;
import java.util.*;

public class ShowInfoServices {
    public static final String PATH_VILLA = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Villa.csv";
    public static final String PATH_HOUSE = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\House.csv";
    public static final String PATH_ROOM = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Room.csv";

    public static List<Villa> villaList = new ArrayList<>();

    // hien thi thong tin villa trong file villa.csv
    public static List<Villa> readInfoAllVilla() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(new File(PATH_VILLA));
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                villa = new Villa(temp[0], temp[1], Float.parseFloat(temp[2]), Float.parseFloat(temp[3]), Integer.parseInt(temp[4])
                        , temp[5], temp[6], temp[7], Float.parseFloat(temp[8]), Integer.parseInt(temp[9]));
                villaList.add(villa);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    // in thong tin villa ra man hinh
    public static void showAllVilla() {
        int i = 1;
        for (Villa villa : villaList) {
            System.out.println("Services villa " + i + " : " + villa.showInfo());
            i++;
        }
    }

    // hien thi danh sach ten co trong file villa.csv khong trung nhau
    public static void showAllNameVillaNotDuplicate() {
        List<Villa> villaList = readInfoAllVilla();
        if (villaList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            TreeSet<String> villaTreeSet = new TreeSet<>();
            for (Villa villa : villaList) {
                villaTreeSet.add(villa.getServiceName());
            }
            System.out.println("Name of services: " + villaTreeSet);
        }
    }


    public static List<House> houseList = new ArrayList<>();

    // hien thi thong tin house trong file house.csv
    public static List<House> readInfoAllHouse() {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(new File(PATH_HOUSE));
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                house = new House(temp[0], temp[1], Float.parseFloat(temp[2]), Float.parseFloat(temp[3]), Integer.parseInt(temp[4])
                        , temp[5], temp[6], temp[7], Integer.parseInt(temp[8]));
                houseList.add(house);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    // in thong tin house ra man hinh
    public static void showAllHouse() {
        int i = 1;
        for (House house : houseList) {
            System.out.println("Services house " + i + " : " + house.showInfo());
            i++;
        }
    }

    // hien thi danh sach ten co trong file house.csv khong trung nhau
    public static void showAllNameHouseNotDuplicate() {
        List<House> houseList = readInfoAllHouse();
        if (houseList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            TreeSet<String> villaTreeSet = new TreeSet<>();
            for (House house : houseList) {
                villaTreeSet.add(house.getServiceName());
            }
            System.out.println("Name of services: " + villaTreeSet);
        }
    }


    public static List<Room> roomList = new ArrayList<>();

    // hien thi thong tin room trong file room.csv
    public static List<Room> readInfoAllRoom() {

        try {
            FileReader fileReader = new FileReader(new File(PATH_ROOM));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                room = new Room(temp[0], temp[1], Float.parseFloat(temp[2]), Float.parseFloat(temp[3]), Integer.parseInt(temp[4])
                        , temp[5], temp[6]);
                roomList.add(room);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    // in thong tin house ra man hinh
    public static void showAllRoom() {
        int i = 1;
        for (Room room : roomList) {
            System.out.println("Services room " + i + " : " + room.showInfo());
            i++;
        }
    }

    // // hien thi danh sach ten co trong file room.csv khong trung nhau

    public static void showAllNameRoomNotDuplicate() {
        List<Room> roomList = readInfoAllRoom();
        if (roomList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            TreeSet<String> treeSetRoom = new TreeSet<>();
            for (Room room : roomList) {
                treeSetRoom.add(room.getServiceName());
            }
            System.out.println("Name of services: " + treeSetRoom);
        }
    }
}

