package ru.nabuhiro.java.basic.homeworks.lesson9;

import java.util.Scanner;

public class Box {
    private String color;
    private float width;
    private float height;
    private float length;
    private boolean status;
    private String item;
    Scanner scanner = new Scanner(System.in);
    public void setColor(String color) {
        this.color = color;
    }

    public String getItem() {
        return item;
    }

    public Box(String color, float width, float height, float length, boolean status) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.status = status;
    }

    public void changeColor() {
        System.out.println("Введите новый цвет для коробки");
        color = scanner.nextLine();
        System.out.println("Цвет коробки теперь: " + color);
    }
    public void info(){
        System.out.println("Цвет коробки: " + color + "\nРазмеры коробки:" + "\nДлина: " + length + "Ширина: " + width + "Высота: " + height);
    }
    public boolean open(){
        status = true;
        System.out.println("Коробка открыта");
        return true;
    }
    public boolean close(){
        status = false;
        System.out.println("Коробка закрыта");
        return false;
    }
    public void setItem(){
        if (close()){
            System.out.println("Коробка закрыта. Перед тем как сложить предмет в коробку, откройте ее");
            return;
        }
        if (!(item == null)){
            System.out.println("В коробке уже лежит предмет. Выложите предмет из коробки прежде чем в нее что-то складывать");
            return;
        }
        System.out.println("Введите предмет, который хотите положить в коробку");
        item = scanner.nextLine();
    }
    public void removeItem(){
        if (close()){
            System.out.println("Коробка закрыта. Откройте ее перед удалением предмета");
            return;
        }
        if (!(item == null)){
            item = null;
            System.out.println("Коробка пуста");
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