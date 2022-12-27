package com.walking.lesson30_regex.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class Main {

    public static final String EXIT = "exit";
    public static final String INPUT_NUMBER = "Input number:";
    public static final String CORRECT = "Correct!";
    public static final String WRONG = "Wrong format number!";
    public static final String REGEX = "^(\\+7|8) ?((\\(\\d{3}\\) ?)|(\\d{3} ?))\\d{3}[ \\-]?\\d{2}[ \\-]?\\d{2}$";
//    public static final Pattern pattern = Pattern.compile(REGEX,Pattern.MULTILINE);

    public static void main(String[] args) {
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        while(!inputString.equals(EXIT)) {
            System.out.println(INPUT_NUMBER);
            inputString = scanner.nextLine();
            if(isCorrectNumber(inputString)) {
                System.out.println(CORRECT);
            } else if (!inputString.equals(EXIT)){
                System.out.println(WRONG);
            }
        }
        scanner.close();
    }

    public static boolean isCorrectNumber(String number) {
        return Pattern.matches(REGEX, number);
    }
}
