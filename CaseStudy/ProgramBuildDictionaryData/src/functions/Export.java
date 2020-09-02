package functions;

import commons.ReadFileDictionary;
import constants.Constants;
import models.Dictionary;

import java.io.*;
import java.util.List;

public class Export {

    public static void export() {
        List<Dictionary> dictionaryList = ReadFileDictionary.readFileCSVDictionary();

        String pathDictionaryText = Constants.PATH_DICTIONARY_TEXT;

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File(pathDictionaryText));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Dictionary dictionary : dictionaryList) {
                bufferedWriter.write(dictionary.displayTxt() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Exporting file txt: 10%..20%..30%..40%..50%..60%..70%..80%..90%..Done!");
    }
}
