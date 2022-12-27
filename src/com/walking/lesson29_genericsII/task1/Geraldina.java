package com.walking.lesson29_genericsII.task1;

/**
 * @author Alexandr Korovkin
 */
public class Geraldina<T> {
    private final T user;

    Geraldina(T user){
        this.user = user;
    }

    public T getUser(){
        return user;
    }
}
