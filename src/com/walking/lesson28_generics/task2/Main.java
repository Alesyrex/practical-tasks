package com.walking.lesson28_generics.task2;

/**
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        AnyObject<String> object = new AnyObject<>("123");
        System.out.println(object.isNull());
        AnyObject<Integer> nullObject = new AnyObject<>(null);
        System.out.println(nullObject.isNull());
    }
}
