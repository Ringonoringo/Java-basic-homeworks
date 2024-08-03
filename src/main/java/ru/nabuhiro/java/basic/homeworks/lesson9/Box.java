package ru.nabuhiro.java.basic.homeworks.lesson9;

import java.util.Scanner;

public class Box {
    private String color;
    private double width;
    private double height;
    private double length;
    private boolean isOpen;
    private String item;
    Scanner scanner = new Scanner(System.in);

    public Box(String color, double width, double height, double length) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Цвет коробки: " + color + "\nРазмеры коробки:" + "\nДлина: " + length + " Ширина: " + width + " Высота: " + height);
        if (item == null) {
            System.out.println("В коробке ничего не лежит");
        } else {
            System.out.println("В коробке:" + item);
        }
    }

    public void open() {
        isOpen = true;
        System.out.println("Коробка открыта");

    }

    public void close() {
        isOpen = false;
        System.out.println("Коробка закрыта");
    }

    public void putItem() {
        if (!isOpen) {
            System.out.println("Коробка закрыта. Перед тем как сложить предмет в коробку, откройте ее");
            return;
        }
        if (item != null) {
            System.out.println("В коробке уже лежит предмет " + item + ".\nВыложите предмет из коробки прежде чем в нее что-то складывать");
            return;
        }
        System.out.println("Введите предмет, который хотите положить в коробку");
        item = scanner.nextLine();
        System.out.println("В коробке лежит " + item);
    }

    public void removeItem() {
        if (!isOpen) {
            System.out.println("Коробка закрыта. Откройте ее перед удалением предмета");
            return;
        }
        if (!(item == null)) {
            System.out.println("Из коробки выложен предмет: " + item);
            item = null;
            return;
        }
        System.out.println("Коробка пуста");
    }
}
/*Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
 (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
 только при условии что коробка открыта (предметом читаем просто строку).
 Выполнение методов должно сопровождаться выводом сообщений в консоль.*/