package ua.javarush.task.pro.task12.task1212;

/* 
Створюємо свій список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        System.arraycopy(elements, 0, capacity, 0, elements.length);
            return elements;

    }
}
