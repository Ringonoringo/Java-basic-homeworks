package ru.nabuhiro.java.basic.homeworks.lesson13;

import static ru.nabuhiro.java.basic.homeworks.lesson13.Terrain.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(100,"igor");
        Car car = new Car(100);
        LandRover landRover = new LandRover(100);
        human.takeAModeOfTransport(landRover);
        car.takeATripForest(100);

    }
}
