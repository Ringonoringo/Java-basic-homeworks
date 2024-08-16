package ru.nabuhiro.java.basic.homeworks.lesson13;

public class LandRover implements Transport {
    private int fuel;
    private String name;
    private int consumptionForest;
    private int consumptionPlain;
    private int consumptionBog;// 3 литра на километр

    public LandRover(int fuel) {
        this.fuel = fuel;
        this.name = "Вездеход";
        this.consumptionForest = 4;
        this.consumptionPlain = 3;
        this.consumptionBog = 5;
    }

    public int takeAModeOfTransport(Transport transport) {
        System.out.println("Человек сел в " + name);
        return fuel;
    }

    public int toSetDown(Transport transport) {
        System.out.println("Человек вышел из " + name);
        return fuel;
    }

    @Override
    public String getType(Transport transport) {
        return "name";
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        if (distance > fuel) {
            System.out.println("Не хватит топлива для такой дистанции " + name);
            return false;
        }
        switch (terrain) {
            case BOG:
                fuel -= distance;
                System.out.println(name + " проехал по болоту. Остаток топлива: " + fuel);
                return false;
            case DENSEFOREST:
                fuel -= distance;
                System.out.println(name + " проехал по густому лесу. Остаток топлива: " + fuel);
                return false;
            case PLAIN:
                fuel -= distance;
                System.out.println("Вездеход проехал по равнине. Остаток топлива: " + fuel);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }
    }
}
