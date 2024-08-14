package ru.nabuhiro.java.basic.homeworks.lesson13;

public class Forest implements Locality {
    private  int distance;
    public Forest (int distance){
        this.distance = distance;
    }
    @Override
   public boolean takeATrip(Locality locality){
    return false;
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
