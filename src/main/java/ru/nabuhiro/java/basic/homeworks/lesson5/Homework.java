package ru.nabuhiro.java.basic.homeworks.lesson5;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int number = 5;
        int[] arr = {1, 2, 3, 6, 6, 5};
        int[] arr1 = {1, 2, 4, 1, 2, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr4 = {7, 3, 4};
        int[] arr5 = {1, 2, 3, 4, 5};
        worldRepeat(number, "нос");
        sumArray(arr);
        filling(arr, number);
        increaseBy(arr, number);
        halfSum(arr1);
        sumArrays(arr1, arr2, arr3);
        findDot(arr4);
        elementEncrease(arr3);
        reverseArray(arr5);

    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку
    // указанное количество раз.
    public static void worldRepeat(int number, String world) {
        for (int i = 0; i < number; i++) {
            System.out.println(world);
        }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    // значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    // -Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public static void filling(int[] array1, int number1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = number1;
        }
        System.out.println(Arrays.toString(array1));
    }

    //-Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.
    public static void increaseBy(int[] array2, int number2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] += number2;
        }
        System.out.println(Arrays.toString(array2));
    }

    //-Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void halfSum(int[] array3) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array3.length / 2; i++) {
            sum1 += array3[i];
        }
        for (int i = array3.length / 2; i < array3.length; i++) {
            sum2 += array3[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма элементов левой половины больше");
        } else {
            System.out.println("Сумма элементов правой половины больше");
        }
    }

    //Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    //массив равный сумме входящих
    public static void sumArrays(int[] arr1, int[] arr2, int[] arr3) {
        int ar4 = 0;
        int ar1 = arr1.length;
        int ar2 = arr2.length;
        int ar3 = arr3.length;
        if (ar1 > ar2 && ar1 > ar3) {
            ar4 = ar1;
        } else if (ar2 > ar1 && ar2 > ar3) {
            ar4 = ar2;
        } else {
            ar4 = ar3;
        }
        int[] arr4 = new int[ar4];
        for (int i = 0; i < arr1.length; i++) {
            arr4[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr4[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] += arr3[i];
        }
        System.out.println(Arrays.toString(arr4));
    }

    //Реализуйте метод, проверяющий, что есть точка в массиве. в которой сумма "левой и правой" частей равны.
// точка находится между элементами
    public static void findDot(int[] dot) {
        int sum_dot = 0;
        int sum_before_dot = 0;
        boolean is_success = false;
        for (int i = 0; i < dot.length; i++) {
            sum_dot += dot[i];
        }
        if (sum_dot % 2 == 0) {
            for (int i = 0; i < dot.length; i++) {
                sum_before_dot += dot[i];
                if (sum_before_dot == sum_dot / 2) {
                    is_success = true;
                    System.out.println("Точка была найдена в массиве:");
                    System.out.print("[");
                    for (int j = 0; j < dot.length; j++) {
                        if (j == i + 1) {
                            System.out.print("|" + dot[j] + ", ");
                        } else {
                            if (j == dot.length - 1) {
                                System.out.println(dot[j] + "]");
                            } else {
                                System.out.print(dot[j] + ", ");
                            }

                        }

                    }
                    break;
                }
            }
            if (!is_success) {
                System.out.println("Точки равности чаcтей массива в данном массиве нет");
            }
        } else {
            System.out.println("Точки равности чаcтей массива в данном массиве нет");
        }
    }

    // Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания\ возрастания
    public static void elementEncrease(int[] array) {
        boolean is_success = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] < array[i + 1])) {
                System.out.println("Элементы массива не идут в порядке возрастания");
                is_success = false;
                break;
            }
        }
        if (is_success) {
            System.out.println("Все элементы массива идут в порядке возрастания");
        }
    }

    //Реализуйте метод, переворачиваюший исходный массив.
    public static void reverseArray(int[] array) {
        int[] reversed_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed_array[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(reversed_array));
    }
}

