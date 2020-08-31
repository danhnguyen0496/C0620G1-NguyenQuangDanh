import models.Customer;
import models.ShowInfoServices;
import models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        bookingVilla();
    }

    public static void bookingVilla() {

//        Scanner scanner = new Scanner(System.in);
//        List<Villa> list = ShowInfoServices.showAllVilla();
//
//        int choice = -1;
//        while (choice < 0 || choice > list.size()) {
//            System.out.print("Select id of the services to booking: \n ID: ");
//            choice = scanner.nextInt();
//        }
//        for (int i = 1; i <= list.size(); i++) {
//            if (i == choice) {
//                System.out.println(list.get(i - 1).showInfo());
//            }
//            final String DOWN = "\n";
//            String PATH_BOOKING = "src/data/Booking.csv";
//            try {
//                FileWriter fileWriter = new FileWriter(new File(PATH_BOOKING), true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append(list.get(i - 1)).append(DOWN);
//                bufferedWriter.write(stringBuilder.toString());
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

}


