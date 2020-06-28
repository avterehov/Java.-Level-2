package ru.geekbrains.home_work_1_2_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание №2 ");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("яблоко");
        arrayList.add("груша");
        arrayList.add("тыква");
        arrayList.add("смородина");
        arrayList.add("тыква");
        arrayList.add("крыжовник");
        arrayList.add("яблоко");
        arrayList.add("яблоко");
        arrayList.add("тыква");
        arrayList.add("яблоко");
        arrayList.add("тыква");
        arrayList.add("тыква");
        arrayList.add("яблоко");

        System.out.println("Исходный массив:");
        System.out.println(arrayList);
        System.out.println("Уникальные элементы Массива:");
        HashSet<String> set = new HashSet<>(arrayList);
        System.out.println(set);
        Iterator<String> iterUnique = set.iterator();
        System.out.println("Количество повторений каждого экземпляра массива:");

        while (iterUnique.hasNext()) {
            String uniqueExemplar = iterUnique.next();
            int numberOfEquals = 0;
            System.out.print(uniqueExemplar + " ");
            for (int j = 0; j < arrayList.size(); j++)
                if (uniqueExemplar.equals(arrayList.get(j))) {
                    numberOfEquals++;

                }
            System.out.println(numberOfEquals);


        }
        System.out.println();
        System.out.println("Задание №2 ");

        Phonebook phonebook = new Phonebook();

        phonebook.add("Сидоров", "+7 999 999 99 99");
        phonebook.add("Сидоров", "+7 888 999 99 99");
        phonebook.add("Иванов", "+7 777 999 99 99");
        phonebook.add("Сидоров", "+7 666 999 99 99");
        phonebook.add("Петров", "+7 555 999 99 99");


        System.out.println("Сидоров" + ":" + phonebook.get("Сидоров"));
    }
}






























