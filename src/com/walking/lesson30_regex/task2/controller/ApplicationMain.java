package com.walking.lesson30_regex.task2.controller;

import com.walking.lesson30_regex.task2.model.FullName;
import com.walking.lesson30_regex.task2.view.ConsoleView;

import java.util.Scanner;

/**
 * @author Alexandr Korovkin
 * <p>
 * Реализуйте метод для работы с ФИО.
 * Входным параметром должна являться строка,
 * содержащая русскоязычное ФИО.
 * Фамилия, имя и отчество должны начинаться с прописной буквы
 * и быть разделены пробелами.
 * Фамилия может быть двойной и писаться через дефис
 * (каждая часть фамилии начинается с прописной буквы).
 * Если строка валидна – верните ФИО, обернутое в класс «Полное имя»,
 * содержащий фамилию, имя и отчество.
 * Если невалидна – бросьте из метода исключение, указывающее на ошибку валидации.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        ConsoleView.print(ConsoleView.INPUT);
        FullName name = Validator.validName(ConsoleView.input());
        ConsoleView.print(name.toString());
        ConsoleView.closeScanner();
    }
}
