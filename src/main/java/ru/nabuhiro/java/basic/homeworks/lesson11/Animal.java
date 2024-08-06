package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;
    int runningConsumption;
    int swimmingConsumption;

    public float run(int distance) {
        float time = 0;
        runningConsumption = 1;
        if (distance * runningConsumption > endurance) {
            System.out.println("У " + name + " состояние усталости после бега");
            time = -1;
        } else {
            time = (float) distance / runningSpeed;
            endurance = endurance - (distance * runningConsumption);
            System.out.println("Время затраченное " + name + " на дистанцию " + distance + " метров равно: " + time + " секунд" + "\nОставшаяся выносливость: " + endurance);
        }
        return time;
    }

    public void info() {
        if (endurance == 0) {
            System.out.println(name + " состояние усталости");
        }
        System.out.println(name + " выносливость: " + endurance);

    }

    public float swim(int distance) {
        float time = 0;
        if (distance * swimmingConsumption > endurance) {
            System.out.println("У " + name + " состояние усталости. " + name + " не проплывет такую дистанцию");
            time = -1;
        } else {
            time = (float) distance / runningSpeed;
            endurance = endurance - (distance * swimmingConsumption);
            System.out.println("Время затраченное " + name + "на заплыв: " + distance + " метров " + time + " секунд" + "\nОставшаяся выносливость: " + endurance);
        }
        return time;
    }
}
/*Создайте классы Cat, Dog и Horse с наследованием от класса Animal
У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
Затраты выносливости:
Все животные на 1 метр бега тратят 1 ед выносливости,
Собаки на 1 метр плавания - 2 ед.
Лошади на 1 метр плавания тратят 4 единицы
Кот плавать не умеет.
Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время,
затраченное на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает,
 то возвращаем время -1 и указываем что у животного появилось состояние усталости.
 При выполнении действий пишем сообщения в консоль.
Добавляем метод info(), который выводит в консоль состояние животного.*/
