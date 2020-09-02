package functions;

import commons.ReadFileDictionary;
import models.Dictionary;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LookUp {

    public static void lookUp() {

        Scanner scanner = new Scanner(System.in);

        List<Dictionary> dictionaryList = ReadFileDictionary.readFileCSVDictionary();
        Map<String, String> mapDictionary = new TreeMap<>();

        System.out.println("Enter the keyword need to search: ");
        String keyWord = scanner.nextLine().toLowerCase();

        boolean checkKeyWord = false;
        for (Dictionary dictionary : dictionaryList) {
            if (keyWord.equals(dictionary.getKeyWord())) {
                mapDictionary.put(dictionary.getKeyWord(), dictionary.display());
                for (Map.Entry<String, String> entry : mapDictionary.entrySet()) {
                    System.out.println("Keyword = " + entry.getKey() + ", Mean of keyword: \n" + entry.getValue());
                    checkKeyWord = true;
                }
            }
        }
        if (!checkKeyWord) {
            System.out.println("The keyword to look up are not in dictionary system");
        }
    }
}
