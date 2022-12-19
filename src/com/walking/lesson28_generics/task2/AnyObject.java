package com.walking.lesson28_generics.task2;

/**
 * @author Alexandr Korovkin
 */
public class AnyObject<T> {
    private final T value;

    public AnyObject(T value) {
        this.value = value;
    }

    public boolean isNull(){
        return value == null;
    }

    public T getValue() {
        return value;
    }
}
