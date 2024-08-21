package ru.nabuhiro.java.basic.homeworks.lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phonebook;

    public PhoneBook (){
        this.phonebook = new HashMap<>();
    }

    public Map<String, List<String>> getContacts() {
        return phonebook;
    }

    public void add(String surnameFirsPatronymic, String number) {
        if (phonebook.containsKey(surnameFirsPatronymic)) {
            System.out.println("Такое ФИО существует. Добавляем номер");
            if (phonebook.get(surnameFirsPatronymic).contains(number)) {
                System.out.println("Номер телефона совпадает с существующим");
            } else {
                System.out.println("Добавили второй номер к " + surnameFirsPatronymic);
                phonebook.get(surnameFirsPatronymic).add(number);
            }
        } else {
            System.out.println("В телефонную книгу добавлена запись " +surnameFirsPatronymic + " " + number);
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            phonebook.put(surnameFirsPatronymic, list);
        }
    }

    public List<String> find(String surnameFirsPatronymic ) {
        return phonebook.get(surnameFirsPatronymic);
    }

    public boolean containsPhoneNumber(String number) {
        for (String surnameFirsPatronymic : phonebook.keySet()) {
            if (phonebook.get(surnameFirsPatronymic).contains(number)) {
                System.out.println("Номер " + number + " найден в телефонной книге");
                return true;
            }
        }
        System.out.println("Номер " + number + " не найден в телефонной книге");
        return false;
    }
}
/*Описание/Пошаговая инструкция выполнения домашнего задания:
Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
Метод add() должен позволять добавлять запись имя-телефон;
Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
Под одним именем может быть несколько телефонов
(в случае однофамильцев, или наличии у одного человека нескольких номеров),
тогда при запросе такой фамилии должны выводиться все телефоны;
Метод containsPhoneNumber должен проверять наличие телефона в справочнике.*/
