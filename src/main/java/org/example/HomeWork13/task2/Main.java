package org.example.HomeWork13.task2;

public class Main {
    public static void main(String[] args) {
        Storage<String> names = new Storage<>();
        names.add("Ivan");
        names.add("Sergey");
        names.add("Pavel");
        names.add("Vladimir");
        try {
            System.out.println(names.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Размер хранилища с именами:" + names.size());

        System.out.println("-------------------------------------------");

        Storage<Integer> numbers = new Storage<>();
        numbers.add(10);
        numbers.add(55);
        numbers.add(186);
        numbers.add(57);
        try {
            System.out.println(numbers.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Размер хранилища с числами:" + numbers.size());

    }
}
