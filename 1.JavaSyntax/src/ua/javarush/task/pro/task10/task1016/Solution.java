package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

import java.io.Serializable;
import java.util.Arrays;

public class Solution {

    private static City city;

    public static void showWeather(City city) {
        System.out.println(String.format("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        City city = new City("Dubai", 40);
        showWeather(city);
    }
}
