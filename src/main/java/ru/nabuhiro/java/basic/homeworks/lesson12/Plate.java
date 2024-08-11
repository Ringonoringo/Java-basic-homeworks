package ru.nabuhiro.java.basic.homeworks.lesson12;

public class Plate { // класс тарелка
    private int amountOfFood; // максимальное количество еды всегда будет равно объему тарелки если брать условные единицы
    private int volumePlate;
    private int food;

    public Plate(int volumePlate) {
        this.volumePlate = volumePlate;
        amountOfFood = volumePlate;
    }

    public void AddFood(int food) {
        this.food = food;
        if (volumePlate >= food + amountOfFood) {
            amountOfFood += food;
            System.out.println("В тарелку добавлено еды " + food);
        } else {
            amountOfFood = volumePlate;
            System.out.println("В тарелку добавлена еда до максимума " + amountOfFood);
        }
    }

    public void info() {
        System.out.println("Количество еды в тарелке " + amountOfFood);
    }

    public boolean foodConsumption(int appetite) {
        if (appetite > amountOfFood && amountOfFood >= 0) {
            return false;
        } else {
            amountOfFood -= appetite;
            return true;
        }
    }
}
/*Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды) и Кот (имя, аппетит).
Количество еды измеряем в условных единицах.
При создании тарелки указывается ее объем и она полностью заполняется едой
В тарелке должен быть метод, позволяющий добавить еду в тарелку.
После добавления в тарелке не может оказаться еды больше максимума
В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения,
 в тарелке не может оказаться отрицательное количество еды (если удалось уменьшить еду так,
 чтобы в тарелке осталось >= 0 кусков еды, то возвращаем true, в противном случае - false).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой,
попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.*/
