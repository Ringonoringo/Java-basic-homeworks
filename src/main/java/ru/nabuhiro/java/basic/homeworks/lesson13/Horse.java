package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Horse implements Transport {
    private int power;
    private String name;

    public Horse(int power) {
        this.power = power;
        this.name = "Лошадь";
    }

    @Override
    public String getType(Transport transport) {
        return name;
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        if (distance > power) {
            System.out.println("Не хватит сил для такой дистанции " + name);
            return false;
        }
        switch (terrain) {
            case BOG:
                System.out.println("Лошадь не может пройти по болоту");
                return false;
            case DENSEFOREST:
                power -= distance;
                System.out.println("Лошадь прошла по густому лесу. Остаток сил: " + power);
                return true;
            case PLAIN:
                power -= distance;
                System.out.println("Лошадь прошла по равнине. Остаток сил: " + power);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }
    }
}