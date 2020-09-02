package functions;

import commons.AdditionalDefinition;
import commons.ReadFileDictionary;
import commons.WriteFileCSVDictionary;
import models.Dictionary;

import java.util.List;
import java.util.Scanner;

public class Define {
    public static Scanner scanner = new Scanner(System.in);

    public static String keyWord = scanner.nextLine().toLowerCase();

    public static void define() {

        List<Dictionary> dictionaryList = ReadFileDictionary.readFileCSVDictionary();

        // tim tu can bo sung dinh nghia
        boolean checkKey = false;
        for (Dictionary dictionary : dictionaryList) {
            if (keyWord.equals(dictionary.getKeyWord())) {
                AdditionalDefinition.additionalDefinition();
                checkKey = true;
                break;
            }
        }

        // tim khong co tu khoa, tu them moi tu vao file
        if (!checkKey) {
            System.out.println("The keyword not find");
            System.out.println("Action to add new words to the file");
            // add keyword to file csv
            WriteFileCSVDictionary.inputInfoDictionary();
            WriteFileCSVDictionary.writeFileCSVDictionary();
        }

    }
}
