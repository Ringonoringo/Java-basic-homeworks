package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Horse implements Vehicle {
    private int power;
    private String name;
    private int consumptionForest;
    private int consumptionPlain;
    private int consumptionBog;

    // не может болото
    public Horse(int power) {
        this.power = power;
        this.name = "Лошадь";
        this.consumptionForest = 2;
        this.consumptionPlain = 3;
    }

    @Override
    public boolean takeATripForest(int distance) {// 4 литра на километр
        if (distance * consumptionForest > power) {
            System.out.println("У " + name + " закончились силы");
            return false;
        }
        System.out.println( name + " лес преодолен");
        power -= distance * consumptionForest;
        return true;
    }

    @Override
    public boolean takeATripPlain(int distance) {// 3 литра на километр
        if (distance * consumptionPlain > power) {
            System.out.println("У " + name + " закончились силы");
            return false;
        }
        System.out.println(name +  " равнина преодолена");
        power -= distance * consumptionPlain;
        return true;

    }

    @Override
    public boolean takeATripBog(int distance) {// не может пересечь болото
        System.out.println(name + " не может пересечь болото");
        return false;

    }

    @Override
    public String getName() {
        return name;
    }
}
/*Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
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
