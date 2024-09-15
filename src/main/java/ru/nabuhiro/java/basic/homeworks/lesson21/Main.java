package ru.nabuhiro.java.basic.homeworks.lesson21;

public class Main {
    public static void main(String[] args) {
        int size = 100_000_000;
        double[] array = new double[size];
        double[] array1 = new double[size];
        long time = System.currentTimeMillis();
        elementMath(array);
        System.out.println(System.currentTimeMillis() - time);
        long time1 = System.currentTimeMillis();
        Thread task1 = new Thread(new MathTask(array1, 0, array1.length / 4));
        Thread task2 = new Thread(new MathTask(array1, array1.length / 4, array1.length / 2));
        Thread task3 = new Thread(new MathTask(array1, array1.length / 2, array1.length * 3 / 4));
        Thread task4 = new Thread(new MathTask(array1, array1.length * 3 / 4, array1.length));

        task1.start();
        task2.start();
        task3.start();
        task4.start();
        try {
            task1.join();
            task2.join();
            task3.join();
            task4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - time1);
    }

    public static void elementMath(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

}
/*Описание/Пошаговая инструкция выполнения домашнего задания:
Необходимо выполнить две реализации задачи заполнения массива
Реализация №1

Реализуйте метод, который создает double массив длиной 100_000_000 элементов
Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
Засеките время выполнения цикла и выведите его в консоль.
Реализация №2:

Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно.
 То есть первый поток заполняет первую четверть массива, второй - вторую и т.д.
 И посмотрите насколько быстрее выполнится работа по сравнению с одним потоком.*/