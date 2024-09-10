package ru.nabuhiro.java.basic.homeworks.lesson17.pp;

public class Main {
    public static void main(String[] args) {
        PersonDataBase dataBase = new PersonDataBase();

        Person person1 = new Person("Vera", Position.BRANCH_DIRECTOR, 1L);
        Person person2 = new Person("Inna", Position.DEVELOPER, 2L);
        Person person3 = new Person("Ksenia", Position.QA, 3L);

        dataBase.add(person1);
        dataBase.add(person2);
        dataBase.add(person3);

        System.out.println(dataBase.findById(1L).getName());
        System.out.println(dataBase.findById(3L).getName());
        System.out.println(dataBase.isManager(person1));
        System.out.println(dataBase.isManager(person2));
        System.out.println(dataBase.isManager(person3));
        System.out.println(dataBase.isEmployee(2L));
        System.out.println(dataBase.isEmployee(1L));
    }
}
