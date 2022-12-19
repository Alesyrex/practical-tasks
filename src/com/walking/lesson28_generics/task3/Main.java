package com.walking.lesson28_generics.task3;

import java.util.NoSuchElementException;

/**
 * @author Alexandr Korovkin
 */
public class Main {

    public static final String OBJECT_NOT_FOUND = "Object not found";

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        GenericArray<Integer> generic = new GenericArray<>(intArray);
        try {
            System.out.println(generic.searchObject(9));
            System.out.println(generic.searchObject(18));
        } catch (NoSuchElementException exception) {
            System.out.println(OBJECT_NOT_FOUND);
        }

    }
}
