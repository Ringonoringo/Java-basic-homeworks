package ru.nabuhiro.java.basic.homeworks;
import ru.nabuhiro.java.basic.homeworks.lesson11.Animal;
import ru.nabuhiro.java.basic.homeworks.lesson11.Cat;
import ru.nabuhiro.java.basic.homeworks.lesson11.Dog;
import ru.nabuhiro.java.basic.homeworks.lesson11.Horse;

public class Main {
    public static void main(String[] args) {
        Animal[] animals ={
                new Cat("Компот", 2,100),
                new Dog("Бобик", 4, 2,500),
                new Horse("Феня",5, 1, 500)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].info();
            animals[i].run(100);
            animals[i].swim(100);
        }
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
затраченное на указанное действие, и “понижать выносливость” животного.
Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
При выполнении действий пишем сообщения в консоль.
Добавляем метод info(), который выводит в консоль состояние животного.
 */