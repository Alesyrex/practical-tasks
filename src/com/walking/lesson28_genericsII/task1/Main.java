package com.walking.lesson28_genericsII.task1;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        Geraldina<Integer> notNull = new Geraldina<>(5);
        System.out.println(getField(notNull, 10));

        Geraldina<Integer> nullObject = new Geraldina<>(null);
        System.out.println(getField(nullObject, 10));
    }

    public static <T> T getField (Geraldina<T> object, T secondObject) {
        if (object.getUser() != null) {
            return object.getUser();
        } else return secondObject;
    }
}
