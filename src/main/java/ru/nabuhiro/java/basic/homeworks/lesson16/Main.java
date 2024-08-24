package ru.nabuhiro.java.basic.homeworks.lesson16;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Verova Vera", "87777777777");
        phoneBook.add("Nikolaev Nikolai", "84444444444");
        phoneBook.add("Innova Inna", "83333333333");
        phoneBook.add("Kristinova Kristine", "81111111111");
        System.out.println(phoneBook.find("Verova Vera"));
        phoneBook.add("Verova Vera", "88888888888");
        System.out.println(phoneBook.find("Verova Vera"));
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.containsPhoneNumber("83333333333"));
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
