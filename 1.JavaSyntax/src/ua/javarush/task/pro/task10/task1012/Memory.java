package ua.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментація пам'яті
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] wet = new String[array.length];
        int a = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] != null){
                wet[a]=array[i];
                a++;
            }
        }
        for (int i = 0; i< array.length; i++){
            array[i] = wet[i];
        }
    }
}
