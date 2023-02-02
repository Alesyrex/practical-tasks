package com.walking.lesson32_files.task1.controller;

import com.walking.lesson32_files.task1.module.Car;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("C123VV",2015, "Red",true);
        Car car2 = new Car("V456BB",2016, "Blue",true);
        Car car3 = new Car("B789NN",2017, "Green",false);
        Car car4 = new Car("N987MM",2018, "Silver",true);
        Car car5 = new Car("M654AA",2019, "Black",false);
        Car car6 = new Car("A321SS",2020, "Grey",true);

        Car[] cars = new Car[]{car1, car2, car3, car4, car5, car6};

        System.out.println(car3);

        try(FileOutputStream fileOS = new FileOutputStream("./resources/lesson32/task1/carCatalog.txt", true)) {
            for(Car car : cars) {
                fileOS.write(parseToSave(car).getBytes());
                fileOS.write('\n');
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    public static String parseToSave(Car car){
        return String.format("%s;%d;%s;%s;",car.getNumber(),car.getYear(),car.getColor(),car.isActualTechnicalInspection());
    }
}
