package ua.javarush.task.pro.task09.task0919;

/* 
Перевертання рядка
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        String result = builder.toString();
        System.out.println(result);
        return builder.reverse().toString();
    }
}
