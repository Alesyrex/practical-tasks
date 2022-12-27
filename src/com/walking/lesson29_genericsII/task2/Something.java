package com.walking.lesson29_genericsII.task2;

/**
 * @author Alexandr Korovkin
 */
public class Something <T extends Number> {
    private final T value;

    public Something(T value){
        this.value = value;
    }
    public double exponentiation(double degree){
        return Math.pow(value.doubleValue(),degree);
    }
}
