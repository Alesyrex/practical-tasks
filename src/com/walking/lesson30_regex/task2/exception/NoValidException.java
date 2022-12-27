package com.walking.lesson30_regex.task2.exception;

/**
 * @author Alexandr Korovkin
 */
public class NoValidException extends RuntimeException{
    public NoValidException(String validStr, String regex) {
        super(String.format("%s no matches to '%s'", validStr, regex));
    }
}
