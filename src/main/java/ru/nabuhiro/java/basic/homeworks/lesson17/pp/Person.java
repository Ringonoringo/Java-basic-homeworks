package ru.nabuhiro.java.basic.homeworks.lesson17.pp;

public class Person {
    String name;
    Position position;
    Long id;
    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }
}
