package com.walking.lesson16_abstract_class_interface.task2;

import com.walking.lesson16_abstract_class_interface.task2.module.*;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через switch-case
 */
public class Main {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();
        PrintAnswer printAnswer = null;

//        Используем конструкцию switch-case для переменной s
        switch (s) {
            case "Hi":  // Если s равно "Hi"
                printAnswer = new PrintHello();
                printAnswer.printAnswer();
                break;

            case "Bye":
                printAnswer = new PrintGoodBye();
                printAnswer.printAnswer();
                break;

            case "How are you":
                printAnswer = new PrintHowAreYou();
                printAnswer.printAnswer();
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                printAnswer = new PrintUnknown();
                printAnswer.printAnswer();
        }
    }
}
