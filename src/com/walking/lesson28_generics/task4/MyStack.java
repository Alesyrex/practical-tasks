package com.walking.lesson28_generics.task4;

import java.util.ArrayList;

/**
 * @author Alexandr Korovkin
 */
public class MyStack<T> {
    private int size;
    private StackElement<T> topElement;

    public MyStack(){
    }

    public MyStack(T topElement){
        this.topElement = new StackElement<>(topElement);
    }

    public void push(T element) {
        topElement = new StackElement<>(element, topElement);
        size++;
    }

    public void delete(T element){
        StackElement<T> temp = topElement;

        if (element.equals(topElement.element)){
            topElement = topElement.next;
            size--;
            return;
        }

        while (temp.next != null) {
            if(element.equals(temp.next.next)){
                topElement.next = topElement.next.next;
                size--;

                return;
            }
            temp = temp.next;
        }
    }

    private class StackElement<T> {
        private StackElement<T> next;
        private T element;

        private StackElement(T element, StackElement<T> next) {
            this.element = element;
            this.next = next;
        }

        private StackElement(T element){
            this.element = element;
        }

    }
}
