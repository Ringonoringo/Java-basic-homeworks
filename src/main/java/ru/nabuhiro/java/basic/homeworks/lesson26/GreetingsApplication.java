package ru.nabuhiro.java.basic.homeworks.lesson26;

public class GreetingsApplication {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        box1.putFruit(new Apple(1), new Apple(1), new Apple(2));
        box2.putFruit(new Orange(2), new Orange(2));
        box3.putFruit(new Fruit(2), new Apple(2), new Orange(2));
        box4.putFruit(new Apple(3), new Apple(3));

        System.out.println("Вес коробок\n 1. " +  box1.weight() + "\n 2. "
                + box2.weight() + "\n 3. " +
                box3.weight() + "\n 4. " +
                box4.weight());
        System.out.println(box1.compare(box2));
        System.out.println(box3.compare(box4));
        box1.moveFruits(box4);
        System.out.println(box1.weight() + " " + box4.weight());
        box1.moveFruits(box3);
        System.out.println(box2.weight() + " " + box1.weight());


    }
}

