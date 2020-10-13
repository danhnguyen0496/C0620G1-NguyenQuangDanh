package service.impl;

import org.springframework.stereotype.Service;
import service.DictionaryService;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryImp implements DictionaryService {

    @Override
    public String translate(String word) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Go", "Đi");
        stringMap.put("School", "Trường học");
        stringMap.put("Apple", "Quả táo");

        String result = null;
        boolean check = false;
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if (entry.getKey().equals(word)) {
                result = entry.getValue();
                check = true;
            }
        }
        if (!check){
            result = "The word not find";
        }
        return result;
    }
}
