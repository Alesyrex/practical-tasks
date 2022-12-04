package com.walking.lesson16_abstract_class_interface.task2.module;

/**
 * @author Alexandr Korovkin
 */
public class PrintHowAreYou implements PrintAnswer {
    @Override
    public void printAnswer() {
        System.out.println("How are your doing?");
    }
}
