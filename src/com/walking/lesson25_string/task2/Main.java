package com.walking.lesson25_string.task2;

/**
 * @author Alexandr Korovkin
 * Реализуйте программу, принимающую с клавиатуры строку, содержащую слова,
 * разделенные пробелом. Выведите в консоль количество уникальных слов в строке.
 * Учтите, что строка может начинаться с пробела.
 *
 * Для упрощения допустим, что в строке не могут использоваться символы,
 * отличные от пробела или русских/английский букв. Помните, что слово
 * может быть введено в разных регистрах.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final String INPUT = "Input phrase for parsing:";
    public static final String SPACE = " ";
    public static final String UNIQUE_WORDS_PHRASE = "Unique words: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(INPUT);
        String [] words = scanner.nextLine().toLowerCase().strip().split(SPACE);
        System.out.println(Arrays.toString(words));
        scanner.close();
        int doublingCount = 0;
        for(int i = 0;i < words.length;++i) {
            for(int j = i+1;j < words.length;j++) {
                if(words[j].equals(words[i])) {
                    doublingCount++;
                    break;
                }
            }
        }
        System.out.println(UNIQUE_WORDS_PHRASE + (words.length - doublingCount));
    }
}
