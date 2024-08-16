package ru.nabuhiro.java.basic.homeworks.lesson13;

import static ru.nabuhiro.java.basic.homeworks.lesson13.Terrain.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(100, "Гена");
        Car car = new Car(100);
        Bicycle bicycle = new Bicycle();
        LandRover landRover = new LandRover(10);
        Horse horse = new Horse(10);
        human.takeAModeOfTransport(horse);
        human.takeATrip(100, DENSEFOREST);
        human.getType();
    }
}
