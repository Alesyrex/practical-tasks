package com.walking.lesson30_regex.task2.view;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 */
public class ConsoleView {
    public static final String INPUT = "Input full name(Russian):";
    private static final Scanner scanner = new Scanner(System.in);

    private ConsoleView(){}

    public static void print(String text) {
        System.out.println(text);
    }
    public static String input() {
        return scanner.nextLine();
    }

    public static void closeScanner(){
        scanner.close();
    }
}
