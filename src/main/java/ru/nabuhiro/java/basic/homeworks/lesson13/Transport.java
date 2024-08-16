package ru.nabuhiro.java.basic.homeworks.lesson13;

public interface Transport {
    String getType(Transport transport);

    boolean takeATrip(int distance, Terrain terrain);
}
