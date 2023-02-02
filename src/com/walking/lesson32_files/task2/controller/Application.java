package com.walking.lesson32_files.task2.controller;

import com.walking.lesson32_files.task2.model.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class Application {

    public static final String FILE_SIZE_PHRASE = "File size: %d\n";
    public static final String CATALOG = "./resources/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = new Car[6];

        try(FileInputStream fileIS = new FileInputStream(CATALOG)) {
            System.out.printf(FILE_SIZE_PHRASE, fileIS.available());

            byte[] buffer = new byte[fileIS.available()];
            fileIS.read(buffer,0,buffer.length);
            String[] tempCars = parseCarCatalog(buffer);

            for (int i = 0;i < tempCars.length;++i){
                cars[i] = getCar(tempCars[i]);
            }

            System.out.println(Arrays.toString(cars));

        } catch(IOException ex) {
            ex.getMessage();
        }
    }

    public static String[] parseCarCatalog(byte[] buffer){

        StringBuilder car = new StringBuilder();
        for (byte b : buffer) {
            car.append((char) b);
        }
        return car.toString().split("\n");
    }

    public static Car getCar(String line){
        String[] tempToStr = line.split(";");
        
        String number = tempToStr[0];
        int year = Integer.parseInt(tempToStr[1]);
        String color = tempToStr[2];
        boolean isActual = tempToStr[3].equals("true");

        return new Car(number,year,color,isActual);
    }
}
