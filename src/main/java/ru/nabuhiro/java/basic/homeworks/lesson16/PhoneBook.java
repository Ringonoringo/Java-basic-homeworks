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

    public void add(String surnameFirstname, String number) {
        if (phonebook.containsKey(surnameFirstname)) {
            System.out.println(surnameFirstname + " уже есть. Добавляем номер");
            if (phonebook.get(surnameFirstname).contains(number)) {
                System.out.println("Полное совпадение. Запись уже есть");
            } else {
                System.out.println("Добавили второй номер " + surnameFirstname);
                phonebook.get(surnameFirstname).add(number);
            }
        } else {
            System.out.println("В телефонную книгу добавлена запись " + surnameFirstname + " " + number);
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            phonebook.put(surnameFirstname, list);
        }
    }

    public List<String> find(String surnameFirsPatronymic ) {
        return phonebook.get(surnameFirsPatronymic);
    }

    public boolean containsPhoneNumber(String number) {
        for (String surnameFirstname : phonebook.keySet()) {
            if (phonebook.get(surnameFirstname).contains(number)) {
                return true;
            }
        }
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
