package commons;

import constants.Constants;
import models.Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFileCSVDictionary {

//    public static List<Dictionary> dictionaryList = new ArrayList<>();

    public static Dictionary dictionary = new Dictionary();

    public static void inputInfoDictionary() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the keyword: ");
        String keyword = scanner.nextLine().toLowerCase();
        dictionary.setKeyWord(keyword);

        System.out.println("Enter the pronounce: ");
        String pronounce = scanner.nextLine().toLowerCase();
        dictionary.setPronounce(pronounce);

        System.out.println("Enter the adjective: ");
        String adjective = scanner.nextLine().toLowerCase();
        dictionary.setAdjective(adjective);

        System.out.println("Enter the example: ");
        String example = scanner.nextLine().toLowerCase();
        dictionary.setExample(example);

        System.out.println("Enter the noun: ");
        String noun = scanner.nextLine().toLowerCase();
        dictionary.setNoun(noun);

        System.out.println("Enter the similar: ");
        String similar = scanner.nextLine().toLowerCase();
        dictionary.setSimilar(similar);

//        new Dictionary(keyword, pronounce, adjective, example, noun, similar);
//        dictionaryList.add(dictionary);
    }

    public static void writeFileCSVDictionary() {
        final String DOWN = "\n";
        final String COMMA = ", ";
        String pathDictionary = Constants.PATH_DICTIONARY;

        try {
            FileWriter fileWriter = new FileWriter(new File(pathDictionary), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(dictionary.getKeyWord()).append(COMMA).append(dictionary.getPronounce()).append(COMMA).
                    append(dictionary.getAdjective()).append(COMMA).append(dictionary.getExample()).append(COMMA).
                    append(dictionary.getNoun()).append(COMMA).append(dictionary.getSimilar()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
