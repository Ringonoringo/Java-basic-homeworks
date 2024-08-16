package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Car implements Transport {
    private int fuel;
    private String name;

    public Car(int fuel) {
        this.fuel = fuel;
        this.name = "Машина";
    }

    @Override
    public String getType(Transport transport) {
        return name;
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        if (distance > fuel) {
            System.out.println("У машины не хватит топлива для такой дистанции");
            return false;
        }
        switch (terrain) {
            case BOG:
                System.out.println(name + " не может проехать по болоту");
                return false;
            case DENSEFOREST:
                System.out.println(name + " не может проехать по густому лесу");
                return false;
            case PLAIN:
                fuel -= distance;
                System.out.println("Машина проехала по равнине. Остаток топлива: " + fuel);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }
    }
}