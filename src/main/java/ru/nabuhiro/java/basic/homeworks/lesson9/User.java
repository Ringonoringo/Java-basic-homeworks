package ru.nabuhiro.java.basic.homeworks.lesson9;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public void fullInfo(){
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " +email);
    }
    public void sort(){
        int thisYear = 2024;
        if ((thisYear-yearOfBirth) >=40) {
            fullInfo();
        }
    }
}
