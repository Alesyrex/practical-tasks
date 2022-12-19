package com.walking.lesson28_generics.task1;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        Something<Double> smth = new Something<Double>(2.3);
        System.out.println(smth.exponentiation(6));
    }
}
