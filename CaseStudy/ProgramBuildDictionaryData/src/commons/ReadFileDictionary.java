package commons;

import constants.Constants;
import models.Dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileDictionary {
    public static List<Dictionary> dictionaryList = new LinkedList<>();

    public static List<Dictionary> readFileCSVDictionary() {
        String pathDictionary = Constants.PATH_DICTIONARY;

        try {
            FileReader fileReader = new FileReader(new File(pathDictionary));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Dictionary dictionary;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                dictionary = new Dictionary(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);
                dictionaryList.add(dictionary);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionaryList;
    }

    public static void displayFileCSVDictionary() {
        for (Dictionary dictionary : dictionaryList) {
            System.out.println(dictionary.display());
        }
    }
}
