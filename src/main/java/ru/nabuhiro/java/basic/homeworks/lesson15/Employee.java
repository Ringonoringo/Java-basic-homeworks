package ru.nabuhiro.java.basic.homeworks.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public ArrayList listOfNames(ArrayList<Employee> list){

        return (ArrayList<Employee>) list;
    }
    public ArrayList listOfAge(ArrayList<Employee> list, int valueAge){

             for (int i = 0; i < list.size(); i++) {
                 if (list.get(i).equals(valueAge)){

                 }
             }
        return (ArrayList<Employee>) list;
    }
}
/*5.Создайте класс Сотрудник с полями: имя, возраст;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
 и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
и проверяющий что средний возраст сотрудников превышает указанный аргумент;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника*/
