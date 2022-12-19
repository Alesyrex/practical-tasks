package com.walking.lesson28_generics.task1;

/**
 * @author Alexandr Korovkin
 */
public class Something<T extends Number> {
    private final T value;

    public Something(T value){
        this.value = value;
    }
    public double exponentiation(double degree){
        return Math.pow(value.doubleValue(),degree);
    }
}
