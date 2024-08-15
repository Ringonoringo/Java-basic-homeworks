package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Human  implements Transport {
     static String name;
    private Transport currentTransport;
    public static int power;
    private int consumptionForest;
    private int consumptionPlain;
    private int consumptionBog;


    public Human(int power, String name) {
        this.name = name;
        this.power = power;
        currentTransport = null;
        this.consumptionForest = 3;
        this.consumptionPlain = 5;
        this.consumptionBog = 1;
    }

    @Override
    public int takeAModeOfTransport(Transport transport) {
        power = transport.power(transport);
        currentTransport = transport;
       return transport.takeAModeOfTransport(transport);

    }

    @Override
    public int toSetDown(Transport transport) {
        return transport.toSetDown(transport);
    }

    @Override
    public String getType(Transport transport) {
        return transport.getType(transport);
    }

    @Override
    public int power(Transport transport) {
        return power;
    }

    @Override
    public boolean takeATrip(int distance, Terrain terrain) {
        switch (terrain) {
            case BOG:
               return currentTransport.takeATrip(distance,terrain);

            case DENSEFOREST:
                System.out.println("Машина не может проехать по густому лесу");
                return false;
            case PLAIN:
                if (distance> power){
                    System.out.println("У машины не хватит топлива для такой дистанции");
                    return  false;
                }
                power -= distance;
                System.out.println("Машина проехала по равнине. Остаток топлива: " + power);
                return true;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + terrain);
        }
    }


// человек. транспорт выбираю из классов.
    // вызов по контракту, когда описывали дни недели
    // если нет транспорта человек просто идет
    // траты сил на километр. 4 км час
}
/*Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
В приложении должны быть типы местности: густой лес, равнина, болото

Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
Человек должен иметь возможность
сесть на любой из этих видов транспорта,
встать с него,
или переместиться на некоторое расстояние (при условии что он находится на каком-либо транспорте)
При попытке выполнить перемещение у человека, не использующего транспорт,
считаем что он просто идет указанное расстояние пешком

При перемещении Машина и Вездеход тратят бензин, который у них ограничен. Лошадь тратит силы.
Велосипед может использоваться без ограничений (можете для усложнения велосипедом тратить силы “водителя”).

 При выполнении действия результат должен быть отпечатан в консоль

У каждого вида транспорта есть местности по которым он не может перемещаться:
машина - густой лес и болото, лошадь и велосипед - болото, вездеход - нет ограничений

При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие*/
