package ru.nabuhiro.java.basic.homeworks.lesson16;

public class Main {
    public static void main(String[] args) {
PhoneBook phoneBook = new PhoneBook();
phoneBook.add("Arinova Arina Arinovna", "89999999999");
phoneBook.add("Alexandrova Alexandra Alexandrovna","88888888888");
phoneBook.add("Verova Vera Verovna", "87777777777");
phoneBook.add("Andreev Andrei Andreevich", "86666666666");
phoneBook.add("Denisov Denis Denisovich", "85555555555");
phoneBook.add("Nikolaev Nikolai Nikolaevich", "84444444444");
phoneBook.add("Innova Inna Innovna", "83333333333");
phoneBook.add("Ksenieva Ksenia Ksenevna", "82222222222");
phoneBook.add("Kristinova Kristine Kristinovna", "81111111111");
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
