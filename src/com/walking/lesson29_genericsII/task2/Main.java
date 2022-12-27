package com.walking.lesson29_genericsII.task2;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        Integer some = 5;
        Something<?> someNumb = getSome(some);
        System.out.println(someNumb.exponentiation(3));
    }

    public static Something<? extends Number> getSome(Number number){
        return new Something<>(number);
    }
}
