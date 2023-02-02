package com.walking.lesson33_arraylist.task1.controller;

import com.walking.lesson33_arraylist.task1.model.Counter;

import java.util.List;

/**
 * @author Alexandr Korovkin
 *
 * Разработать программу в рамках компании com.walking,
 * позволяющую следить за счетчиками на газ, холодную воду,
 * горячую воду и электричество.
 * Обозначение программы в рамках компании — counterAggregation.
 * <p>
 * Используя за основу задачу из темы про классы и объекты
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/lesson8_classes_objects">...</a>,
 * реализовать класс счетчика, который хранит название счетчика и его значение,
 * его единицы измерения, а также обеспечивает доступ к значениям.
 * Название счетчика и его единицы измерения должны быть неизменны.
 * <p>
 * Также реализовать сервис CounterService, зона ответственности которого —
 * хранение массива доступных счетчиков, получение всех доступных счетчиков,
 * получение доступа к счетчику по названию,
 * увеличение значения счетчика на единицу или заданное значение,
 * а также сброс счетчика до нулевого значения.
 * <p>
 * Ответственность класса, содержащего main() — создание счетчиков.
 * Сам класс также предлагаю назвать Main.
 * <p>
 * Также реализовать в классе Main приватный метод,
 * который позволяет вывести значения счетчиков в виде:
 * <Название счетчика>: <Значение счетчика>.
 * */

public class Application {
    public static final String GAS_COUNTER_NAME = "Газ";
    public static final String COLD_WATER_COUNTER_NAME = "Холодная вода";
    public static final String HOT_WATER_COUNTER_NAME = "Горячая вода";
    public static final String ELECTRIC_COUNTER_NAME = "Электричество";

    public static final String M_3_UNIT = "м3";
    public static final String KW_H_UNIT = "кВт/ч";

    public static void main(String[] args){
        Counter gasCounter = new Counter(GAS_COUNTER_NAME,M_3_UNIT);
        Counter coldWaterCounter = new Counter(COLD_WATER_COUNTER_NAME,M_3_UNIT);
        Counter hotWaterCounter = new Counter(HOT_WATER_COUNTER_NAME,M_3_UNIT);
        Counter electricCounter = new Counter(ELECTRIC_COUNTER_NAME, KW_H_UNIT);

        CounterService service = new CounterService();
        service.addCounter(gasCounter);
        service.addCounter(coldWaterCounter);
        service.addCounter(hotWaterCounter);
        service.addCounter(electricCounter);

        service.incrementCounter(GAS_COUNTER_NAME);
        service.increaseCounter(HOT_WATER_COUNTER_NAME, 10);
        service.increaseCounter(ELECTRIC_COUNTER_NAME,200);

        printCounters(service.getCounters());
    }

    public static void printCounters(List<Counter> counters){
        for (Counter counter: counters) {
            System.out.println(counter.getNameCounter() + " : " + counter.getValue() + " " + counter.getUnits());
        }
    }
}
