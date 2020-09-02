package commons;

import constants.Constants;
import functions.Define;
import models.Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionalDefinition {

    public static Scanner scanner = new Scanner(System.in);

    public static List<Dictionary> dictionaryList = ReadFileDictionary.readFileCSVDictionary();

    // chon loai tu (adj/n) can bo sung dinh nghia
    public static void additionalDefinition() {

        int typeWord;
        System.out.println("Enter the word type to add define: \n1. Adjective \n2. Noun");
        do {
            System.out.println("Enter the select word type: ");
            typeWord = scanner.nextInt();
            switch (typeWord) {
                case 1:
                    additionalDefinitionAdj();
                    break;
                case 2:
                    //
                    break;
            }
        } while (typeWord < 1 || typeWord > 3);
    }

    // bo sung dinh nghia cho adj
    public static void additionalDefinitionAdj() {

        List<Dictionary> dictionaryListNew = new ArrayList<>();

        for (Dictionary dictionary : dictionaryList) {
            if (Define.keyWord.equals(dictionary.getKeyWord())) {
                System.out.println("Enter content add define: ");
                scanner.skip("\\R");
                String content = scanner.nextLine();
                dictionary.setAdjective(content);
                break;
            }
            dictionaryListNew.add(dictionary);
        }
        final String DOWN = "\n";
        final String COMMA = ", ";
        String pathDictionary = Constants.PATH_DICTIONARY;

        for (Dictionary dictionaryNew : dictionaryListNew) {
            try {
                FileWriter fileWriter = new FileWriter(new File(pathDictionary));
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(dictionaryNew.getKeyWord()).append(COMMA).append(dictionaryNew.getPronounce()).append(COMMA).
                        append(dictionaryNew.getAdjective()).append(COMMA).append(dictionaryNew.getExample()).append(COMMA).
                        append(dictionaryNew.getNoun()).append(COMMA).append(dictionaryNew.getSimilar()).append(DOWN);
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
