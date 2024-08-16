package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Bicycle implements Transport {
    private String name;
    private int power;

    public Bicycle() {
        this.name = "Велосипед";
        this.power = Human.power;
    }

    @Override
    public String getType(Transport transport) {
        return name;
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        if (distance > power) {
            System.out.println("У человека не хватит сил для такой дистанции");
            return false;
        }
        switch (terrain) {
            case BOG:
                System.out.println("Велосипед не может проехать по болоту");
                return false;
            case DENSEFOREST:
                power -= distance;
                System.out.println("Велосипед проехал по густому лесу. Остаток сил человека: " + power);
                return true;
            case PLAIN:
                power -= distance;
                System.out.println("Велосипед проехал по равнине. Остаток сил человека: " + power);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }
    }
}
