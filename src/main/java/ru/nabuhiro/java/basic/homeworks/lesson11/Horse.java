package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Horse extends Animal {
    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.runningConsumption = 1;
        this.swimmingConsumption = 4;
    }

}
