package ru.nabuhiro.java.basic.homeworks.lesson13;

public class LandRover implements Transport{
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

    @Override
    public int takeAModeOfTransport(Transport transport) {
        System.out.println("Человек сел в вездеход");
        return fuel;
    }

    @Override
    public int toSetDown(Transport transport) {
        System.out.println("Человек вышел из вездехода");
        return fuel;
    }

    @Override
    public String getType(Transport transport) {
        return "Вездеход";
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        switch (terrain) {
            case BOG:
                System.out.println("Машина не может проехать по болоту");
                return false;
            case DENSEFOREST:
                System.out.println("Машина не может проехать по густому лесу");
                return false;
            case PLAIN:
                if (distance> fuel){
                    System.out.println("У машины не хватит топлива для такой дистанции");
                    return  false;
                }
                fuel -= distance;
                System.out.println("Машина проехала по равнине. Остаток топлива: " + fuel);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }

    }

    @Override
    public int power(Transport transport) {
        return fuel;
    }
}
/*Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние
с указанием типа местности
В приложении должны быть типы местности: густой лес, равнина, болото
Человек должен иметь возможность сесть на любой из этих видов транспорта, встать с него,
или переместиться на некоторое расстояние (при условии что он находится на каком-либо транспорте)
При попытке выполнить перемещение у человека, не использующего транспорт, с
читаем что он просто идет указанное расстояние пешком
При перемещении Машина и Вездеход тратят бензин, который у них ограничен. Лошадь тратит силы.
Велосипед может использоваться без ограничений (можете для усложнения велосипедом тратить силы “водителя”).
 При выполнении действия результат должен быть отпечатан в консоль
У каждого вида транспорта есть местности по которым он не может перемещаться:
машина - густой лес и болото, лошадь и велосипед - болото, вездеход - нет ограничений
При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие*/
