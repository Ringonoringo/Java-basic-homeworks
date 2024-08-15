package ru.nabuhiro.java.basic.homeworks.lesson13;

public interface Transport {
    int takeAModeOfTransport(Transport transport);
    int toSetDown(Transport transport);
    String getType(Transport transport);
    boolean takeATrip(int distance, Terrain terrain);
    int power(Transport transport);

}
