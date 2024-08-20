package ru.nabuhiro.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Employee {//Создайте класс Сотрудник с полями: имя, возраст;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return '[' + "Name: " + name + ',' + " Age: " + age + ']';
    }

    //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static List<String> listOfNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        for (Employee employee : list) {
            names.add(employee.name);
        }
        return names;

    }

    //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
// и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    public static List listOfAge(List<Employee> list, int valueAge) {
        List<String> age = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age >= valueAge) {
                age.add(String.valueOf(employee));
            }
        }
        return age;
    }

    //Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
    //и проверяющий что средний возраст сотрудников превышает указанный аргумент;
    public static boolean averageAge(List<Employee> list, int valueAge) {
        int sumAges = 0;
        for (Employee employee : list) {
            sumAges += employee.age;
        }
        return sumAges / list.size() > valueAge;
    }

    //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника*/
    public static Employee theYoungest(List<Employee> list) {
        Employee youngest = list.get(0);
        for (Employee employee : list) {
            if (youngest.age > employee.age) {
                youngest = employee;
            }
        }
        return youngest;
    }
}
