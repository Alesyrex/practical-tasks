package com.walking.lesson28_generics.task3;

import java.util.NoSuchElementException;

/**
 * @author Alexandr Korovkin
 */
public class GenericArray<T> {
    private final T[] arrayOfObject;

    public GenericArray(T[] arrayOfObject){
        this.arrayOfObject = arrayOfObject;
    }

    public T searchObject(T object) throws NoSuchElementException {
        for (T o : arrayOfObject) {
            if (o.equals(object)) {
                return o;
            }
        }
        throw new NoSuchElementException();
    }
}
