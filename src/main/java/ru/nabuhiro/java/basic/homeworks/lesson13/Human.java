package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Human  implements Transport{
    private String name;
    private String currentTransport;
    public static int power;
    private int consumptionForest;
    private int consumptionPlain;
    private int consumptionBog;


    public Human(int power, String name) {
        this.name = name;
        this.power = power;
        this.consumptionForest = 3;
        this.consumptionPlain = 5;
        this.consumptionBog = 1;
    }

    @Override
    public int takeAModeOfTransport(Transport transport) {
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


    public boolean takeATripForest(int distance) {// 4 литра на километр
        if (distance * consumptionForest > power) {
            System.out.println("У " + name + " закончились силы");
            return false;
        }
        System.out.println( name + " лес преодолен");
        power -= distance * consumptionForest;
        return true;
    }


    public boolean takeATripPlain(int distance) {// 3 литра на километр
        if (distance * consumptionPlain > power) {
            System.out.println("У " + name + " закончились силы");
            return false;
        }
        System.out.println(name +  " равнина преодолена");
        power -= distance * consumptionPlain;
        return true;

    }

    public boolean takeATripBog(int distance) {// не может пересечь болото
        if (distance * consumptionBog > power) {
            System.out.println("У " + name + " закончились силы");
            return false;
        }
        System.out.println(name +  " болото преодолено");
        power -= distance * consumptionBog;
        return true;

    }


    public String getName() {
        return name;
    }/*
    public void takeAModeOfTransport(TakeTransport takeTransport){
       takeTransport.takeAModeOfTransport(takeTransport);
    }*/

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
