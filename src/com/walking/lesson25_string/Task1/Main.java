package com.walking.lesson25_string.Task1;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 *
 * Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java
 * используя StringBuilder или StringBuffer.
 */
public class Main {

    public static final String LENGTH = "Enter rectangle's length: ";
    public static final String WIDTH = "Enter rectangle's width: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = requireInt(scanner, LENGTH);
        int width = requireInt(scanner, WIDTH);

        scanner.close();
        PrintFigure figure = new PrintRectangle(length, width);
        figure.printFigure();
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }
}

