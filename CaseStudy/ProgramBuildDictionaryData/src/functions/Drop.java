package functions;

import commons.ReadFileDictionary;
import constants.Constants;
import models.Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drop {

    public static void drop() {
        Scanner scanner = new Scanner(System.in);
        List<Dictionary> dictionaryList = ReadFileDictionary.readFileCSVDictionary();

        System.out.println("Enter the word you want to find to delete");
        String word = scanner.nextLine();

        for (int i = 0; i < dictionaryList.size(); i++) {
            if (word.equals(dictionaryList.get(i).getKeyWord())) {
                System.out.println("List dictionary remove:\n" + dictionaryList.get(i).display());
                dictionaryList.remove(dictionaryList.get(i));
                break;
            }
        }

        List<Dictionary> dictionaryListRemove = new ArrayList<>(dictionaryList);

        final String DOWN = "\n";
        final String COMMA = ", ";
        String pathDictionary = Constants.PATH_DICTIONARY;
        try {
            FileWriter fileWriter = new FileWriter(new File(pathDictionary));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Dictionary dictionaryRemove : dictionaryListRemove) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(dictionaryRemove.getKeyWord()).append(COMMA).append(dictionaryRemove.getPronounce()).append(COMMA).
                        append(dictionaryRemove.getAdjective()).append(COMMA).append(dictionaryRemove.getExample()).append(COMMA).
                        append(dictionaryRemove.getNoun()).append(COMMA).append(dictionaryRemove.getSimilar()).append(DOWN);
                bufferedWriter.write(stringBuilder.toString());
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
