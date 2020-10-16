package service;

import model.Letter;

public interface LetterService {
    Letter getLetter();

    void update(Letter letter);
}
