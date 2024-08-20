package ru.nabuhiro.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.List;

import static ru.nabuhiro.java.basic.homeworks.lesson15.Employee.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(valuesInARange(3, 6));
        System.out.println(sumIsGreaterThan((ArrayList<Integer>) list, 5));
        System.out.println(fillingWithNumber((ArrayList<Integer>) list, 5));
        System.out.println(increaseByNumber((ArrayList<Integer>) list, 5));
        Employee employee1 = new Employee("Anna", 20);
        Employee employee2 = new Employee("Inna", 25);
        Employee employee3 = new Employee("Kristine", 30);
        Employee employee4 = new Employee("Vera", 35);
        Employee employee5 = new Employee("Julia", 40);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        System.out.println(listOfNames(employees));
        System.out.println(listOfAge(employees, 30));
        System.out.println(averageAge(employees, 30));
        System.out.println(theYoungest(employees));

    }

    //1.Реализуйте метод, принимающий в качестве аргументов числа min и max,
    //и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    public static List valuesInARange(int min, int max) {
        List<Integer> list = new ArrayList<>();
        while (min <= max) {
            list.add(min);
            min++;
        }
        System.out.println(list);
        return list;
    }

    //2.Реализуйте метод, принимающий в качестве аргумента список целых чисел,лист интеджеров
    //суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
    public static int sumIsGreaterThan(ArrayList<Integer> list, int number) {// список интов
        int sum = 0;
        for (Integer element : list) {
            if (element > number) {
                sum += element;
            }
        }
        return sum;
    }

    //3.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    //метод должен переписать каждую заполненную ячейку списка указанным числом;
    public static List fillingWithNumber(ArrayList<Integer> list, int number) {// число и ссылку на список
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        return list;
    }

    // 4.Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    //увеличивающий каждый элемент списка на указанное число;
    public static List increaseByNumber(ArrayList<Integer> list, int number) { // число и ссылка на список
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + number));
        }
        return list;
    }
}

