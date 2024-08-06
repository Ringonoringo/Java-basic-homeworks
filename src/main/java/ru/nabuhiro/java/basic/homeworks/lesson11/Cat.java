package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
        this.runningConsumption = 1;
    }

    @Override
    public float swim(int distance) {
        System.out.println(name + " на берегу, т.к не умеет плавать");
        float time = -1;
        return time;
    }
}
