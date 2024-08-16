package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Human {
    private String name;
    private Transport currentTransport;
    public static int power;

    public Human(int power, String name) {
        this.name = name;
        this.power = power;
    }

    public String takeAModeOfTransport(Transport transport) {
        if (currentTransport != transport && currentTransport != null) {
            System.out.println(name + " уже взял транспортное средство " + currentTransport.getType(transport));
        } else {
            currentTransport = transport;
            System.out.println(name + " взял " + currentTransport.getType(transport));
        }
        return currentTransport.getType(transport);
    }

    public void toSetDown(Transport transport) {
        if (currentTransport != transport) {
            System.out.println("Человек уже взял транспортное средство " + currentTransport.getType(transport) + " и убирает его, чтобя взять новое транспортное средство");
        }
        currentTransport = null;
    }

    public void getType() {
        if (!(currentTransport instanceof Car || currentTransport instanceof LandRover || currentTransport instanceof Horse || currentTransport instanceof Bicycle)) {
            System.out.println("Человек без транспортного средства");
        } else {
            System.out.println("Человек сейчас взял транспортное средство " + currentTransport.getType(currentTransport));
        }
    }

    public boolean takeATrip(int distance, Terrain terrain) {
        if (currentTransport instanceof Car || currentTransport instanceof LandRover || currentTransport instanceof Horse || currentTransport instanceof Bicycle) {
            System.out.println("Человек идет пешком по местности");
            return true;
        }
        return currentTransport.takeATrip(distance, terrain);
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
