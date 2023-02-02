package com.walking.lesson33_arraylist.task1.model;

/**
 * @author Alexandr Korovkin
 */
public class Counter {
    private final String nameCounter;
    private Integer value;
    private final String units;

    public Counter(String nameCounter, Integer value, String units) {
        this.nameCounter = nameCounter;
        this.value = value;
        this.units = units;
    }

    public Counter(String nameCounter, String units) {
        this.nameCounter = nameCounter;
        this.units = units;
        this.value = 0;
    }

    public String getNameCounter() {
        return nameCounter;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }
}
