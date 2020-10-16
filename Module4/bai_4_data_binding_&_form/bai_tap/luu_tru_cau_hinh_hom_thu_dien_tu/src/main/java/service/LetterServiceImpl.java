package service;

import model.Letter;
import org.springframework.stereotype.Service;

@Service
public class LetterServiceImpl implements LetterService {
    private static Letter letter = new Letter("Vietnamese", "1", "Enable Spam Filter", "Thor King");


    @Override
    public Letter getLetter() {
        return letter;
    }

    @Override
    public void update(Letter let) {
        letter.setLanguage(let.getLanguage());
        letter.setPageSize(let.getPageSize());
        letter.setSignature(let.getSignature());
        letter.setSpamFilter(let.getSpamFilter());
    }
}
