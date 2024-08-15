package ru.nabuhiro.java.basic.homeworks.lesson13;

public interface DenseForest extends Locality {
    @Override
    boolean walk(int distance, Locality locality);
}
