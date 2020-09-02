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

    // chon loai tu (adj/n) can bo sung dinh nghia
    public static void additionalDefinition(List<Dictionary> dictionaryList) {
        Scanner scanner = new Scanner(System.in);
        int typeWord;
        System.out.println("Enter the word type to add define: \n1. Adjective \n2. Noun");
        do {
            System.out.println("Enter the select word type: ");
            typeWord = scanner.nextInt();
            switch (typeWord) {
                case 1:
                    additionalDefinitionAdj(dictionaryList);
                    break;
                case 2:
                    additionalDefinitionNoun(dictionaryList);
                    break;
            }
        } while (typeWord < 1 || typeWord > 3);
    }

    // bo sung dinh nghia cho adj
    public static void additionalDefinitionAdj(List<Dictionary> dictionaryList) {
        Scanner scanner = new Scanner(System.in);
        List<Dictionary> dictionaryListAdjective = new ArrayList<>();

        for (Dictionary dictionary : dictionaryList) {
            if (Define.keyWord.equals(dictionary.getKeyWord())) {
                System.out.println("Enter content add define adjective: ");
                String content = scanner.nextLine();
                dictionary.setAdjective(content);
            }
            dictionaryListAdjective.add(dictionary);
        }
        final String DOWN = "\n";
        final String COMMA = ", ";
        String pathDictionary = Constants.PATH_DICTIONARY;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File(pathDictionary));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Dictionary dictionaryNew : dictionaryListAdjective) {
                try {
                    String stringBuilder = dictionaryNew.getKeyWord() + COMMA + dictionaryNew.getPronounce() + COMMA +
                            dictionaryNew.getAdjective() + COMMA + dictionaryNew.getExample() + COMMA +
                            dictionaryNew.getNoun() + COMMA + dictionaryNew.getSimilar() + DOWN;
                    bufferedWriter.write(stringBuilder);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // bo sung dinh nghia cho noun
    public static void additionalDefinitionNoun(List<Dictionary> dictionaryList) {
        Scanner scanner = new Scanner(System.in);
        List<Dictionary> dictionaryListNoun = new ArrayList<>();

        for (Dictionary dictionary : dictionaryList) {
            if (Define.keyWord.equals(dictionary.getKeyWord())) {
                System.out.println("Enter content add define noun: ");
                String content = scanner.nextLine();
                dictionary.setNoun(content);
            }
            dictionaryListNoun.add(dictionary);
        }

        final String DOWN = "\n";
        final String COMMA = ", ";
        String pathDictionary = Constants.PATH_DICTIONARY;
        try {
            FileWriter fileWriter = new FileWriter(new File(pathDictionary));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Dictionary dictionaryNoun : dictionaryListNoun) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(dictionaryNoun.getKeyWord()).append(COMMA).append(dictionaryNoun.getPronounce()).append(COMMA).
                        append(dictionaryNoun.getAdjective()).append(COMMA).append(dictionaryNoun.getExample()).append(COMMA).
                        append(dictionaryNoun.getNoun()).append(COMMA).append(dictionaryNoun.getSimilar()).append(DOWN);
                bufferedWriter.write(stringBuilder.toString());
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
