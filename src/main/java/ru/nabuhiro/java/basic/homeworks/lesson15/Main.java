package ru.nabuhiro.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        // valuesInARange(3, 6);
        //sumIsGreaterThan((ArrayList<Integer>) list,5);
        fillingWithNumber((ArrayList<Integer>) list, 5);
        increaseByNumber((ArrayList<Integer>) list, 5);

    }

    //1.Реализуйте метод, принимающий в качестве аргументов числа min и max,
    //и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    public static ArrayList valuesInARange(int min, int max) {
        List<Integer> list = new ArrayList<>();
        while (min <= max) {
            list.add(min);
            min++;
        }
        System.out.println(list);
        return (ArrayList<Integer>) list;
    }

    //2.Реализуйте метод, принимающий в качестве аргумента список целых чисел,лист интеджеров
    //суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
    public static int sumIsGreaterThan(ArrayList<Integer> list, int number) {// список интов
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    //3.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    //метод должен переписать каждую заполненную ячейку списка указанным числом;
    public static void fillingWithNumber(ArrayList<Integer> list, int number) {// число и ссылку на список
        System.out.println(list);
        // Integer s = 0;
        //Iterator<Integer> iter = list.iterator();
        //  while (iter.hasNext()){
        //  s = iter.next();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        // }
        System.out.println(list);
    }

    // 4.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    //увеличивающий каждый элемент списка на указанное число;
    public static void increaseByNumber(ArrayList<Integer> list, int number) { // число и ссылка на список
        System.out.println(list);
        //Iterator<Integer> iter = list.iterator();
        // while (iter.hasNext()) {
        //  Integer s = iter.next();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + number));
        }
        // }
        System.out.println(list);
    }
}

/*1.Реализуйте метод, принимающий в качестве аргументов числа min и max,
и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
2.Реализуйте метод, принимающий в качестве аргумента список целых чисел,лист интеджеров
суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
3.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
метод должен переписать каждую заполненную ячейку списка указанным числом;
4.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
 увеличивающий каждый элемент списка на указанное число;
5.Создайте класс Сотрудник с полями: имя, возраст;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
 и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
и проверяющий что средний возраст сотрудников превышает указанный аргумент;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.*/
