package com.walking.lesson30_regex.task2.model;

/**
 * @author Alexandr Korovkin
 */
public class FullName {
    private static final String SPACE = " ";
    private String firstName;
    private String lastName;
    private String dadName;

    public FullName() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public String toString(){
        return lastName + SPACE + firstName + SPACE + dadName;
    }
}
