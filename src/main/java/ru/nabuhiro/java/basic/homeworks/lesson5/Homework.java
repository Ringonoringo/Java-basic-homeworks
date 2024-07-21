package ru.nabuhiro.java.basic.homeworks.lesson5;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int number =5;
worldRepeat(number,"нос");
int [] arr = {1,2,3,6,6,5};
int [] arr1 = {1,2,4,1,2,3};
sumArray(arr);
filling(arr,number);
increaseBy(arr,number);
halfSum(arr1);

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
    public static void sumArray(int [] array) {
        array = new int[5];
        int sum = 0;
       for (int i = 0; i< array.length; i++ ){
           if(array[i]>5) {
               sum += array[i];
           }
       }
        System.out.println(sum);
    }
    // -Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public static void filling(int [] array1, int number1) {
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
    public static void halfSum(int [] array3) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array3.length/2; i++) {
            sum1 += array3[i];
        }
        for (int i = array3.length/2; i <array3.length ; i++) {
            sum2 += array3[i];
        }
        if (sum1>sum2){
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }
    }
}

