package ru.nabuhiro.java.basic.homeworks.lesson7;

public class TwoDimensionalMassive {
    public static void main(String[] args) {
        int sizeSquare = 3;
        int[][] array = {{-2, 4, 2}, {3, 6, 2}, {1, 1, 1}};
        int[][] array1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] array2 = {{1, 1, 1}, {}, {1, 1, 1}};
        System.out.println(sumOfPositiveElements(array));
        symbolsSquare(sizeSquare);
        zeroDiagonal(array1);
        System.out.println(findMax(array));
        System.out.println(twoStringSum(array2));
    }

    //Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
// метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] array) {
        int sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sumOfElements += array[i][j];
                }
            }
        }
        return sumOfElements;
    }

    //Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
// символов * со сторонами соответствующей длины;
    public static void symbolsSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
// и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    public static void zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    //Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,
// то в качестве результата необходимо вернуть -1
    public static int twoStringSum(int[][] array) {
        int sumElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 1) {
                    sumElements += array[i][j];
                } else {
                    sumElements = -1;
                }
            }
        }
        return sumElements;
    }
}

