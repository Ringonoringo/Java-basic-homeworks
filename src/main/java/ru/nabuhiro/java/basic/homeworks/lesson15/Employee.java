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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
