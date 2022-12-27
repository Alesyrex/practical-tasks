package com.walking.lesson30_regex.task2.controller;

import com.walking.lesson30_regex.task2.exception.NoValidException;
import com.walking.lesson30_regex.task2.model.FullName;

/**
 * @author Alexandr Korovkin
 */
public class Validator {
    private static final String RUS = "[А-Я&&[^ЬЪ]][а-я]";
    private static final String REGEX_FULL = "^" + RUS + "+?( |-" + RUS + "+? )" + RUS + "+? " + RUS + "+$";

    private Validator() {

    }

    public static FullName validName(String fullName) throws RuntimeException {
        if (fullName.matches(REGEX_FULL)) {
            FullName character = new FullName();
            String[] name = fullName.split(" ");
            character.setLastName(name[0]);
            character.setFirstName(name[1]);
            character.setDadName(name[2]);
            return character;
        } else {
            throw new NoValidException(fullName, REGEX_FULL);
        }
    }
}
