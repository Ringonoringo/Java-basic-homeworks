package ru.nabuhiro.java.basic.homeworks.lesson21;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int size = 100_000_000;
        double[] array = new double[size];
        elementMath(array);
        System.out.println(System.currentTimeMillis() - time);
    }

        public static void elementMath(double[] array){
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