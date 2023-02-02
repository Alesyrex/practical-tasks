package com.walking.lesson33_arraylist.task1.controller;

import com.walking.lesson33_arraylist.task1.model.Counter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class CounterService {
    private final List<Counter> counters;

    public CounterService(List<Counter> counters) {
        this.counters = new ArrayList<>(counters);
    }

    public CounterService() {
        counters = new ArrayList<>();
    }

    public List<Counter> getCounters() {
        return counters;
    }

    private Counter getCounterByName(String name) {
        for (Counter counter : counters) {
            if (counter.getNameCounter().equals(name)) {
                return counter;
            }
        }
        return null;
    }

    public void addCounter(Counter counter) {
        counters.add(counter);
    }

    public boolean incrementCounter(String name) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return false;
        }

        return incrementCounter(counter);
    }

    private boolean incrementCounter(Counter counter) {
        return increaseCounter(counter, 1);
    }

    public boolean increaseCounter(String name, Integer value) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return false;
        }
        return increaseCounter(counter, value);
    }

    private boolean increaseCounter(Counter counter, Integer value) {
        counter.setValue(counter.getValue() + value);
        return true;
    }

    public boolean resetCounter(String name) {
        Counter counter = getCounterByName(name);

        if (counter == null) {
            return false;
        } else {
            counter.setValue(0);
            return true;
        }
    }
}
