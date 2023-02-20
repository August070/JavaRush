package ua.javarush.task.pro.task11.task1102;

/* 
Земля: технічна характеристика
*/

public class Planet {

    public static String name;

    public static long age;

    public static int speed;

    public static int area;

    public void printInformation() {
        System.out.println("Ім'я планети: " + name + ".");
        System.out.println("Вік: " + age + " років.");
        System.out.println("Орбітальна швидкість: " + speed + " км/год.");
        System.out.println("Загальна площа: " + area + " кв. км.");
    }
}
