package com.walking.lesson16_abstract_class_interface.task2.module;

/**
 * @author Alexandr Korovkin
 */
public class PrintGoodBye implements PrintAnswer {
    @Override
    public void printAnswer() {
        System.out.println("Good bye!");
    }
}
