package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShowInfoServices {

    // hien thi thong tin villa trong file villa.csv
    public static void showAllVilla() {
        List<Villa> villaList = new ArrayList<>();

        final String PATH_VILLA = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Villa.csv";
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
        for (Villa villa : villaList) {
            System.out.println(villa.showInfo());
        }
    }

    // hien thi thong tin house trong file house.csv
    public static void showAllHouse() {
        List<House> houseList = new ArrayList<>();

        final String PATH_HOUSE = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\House.csv";
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

        for (House house : houseList) {
            System.out.println(house.showInfo());
        }
    }

    // hien thi thong tin room trong file room.csv
    public static void showAllRoom() {
        List<Room> roomList = new ArrayList<>();

        final String PATH_ROOM = "D:\\C0620G1-NguyenQuangDanh\\CaseStudy\\CaseStudyModule2\\src\\data\\Room.csv";
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

        for (Room room : roomList) {
            System.out.println(room.showInfo());
        }
    }
}

