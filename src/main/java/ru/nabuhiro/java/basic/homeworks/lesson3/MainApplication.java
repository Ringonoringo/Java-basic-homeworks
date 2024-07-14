package ru.nabuhiro.java.basic.homeworks.lesson3;

import java.util.Scanner;

public class MainApplication {
        public static void main(String[] args) {
            //При запуске приложения, запросите у пользователя число от 1 до 5,
            // и после ввода выполнения метод, соответствующий указанному номеру со случайным значением аргументов;
            Scanner scanner =new Scanner(System.in);
            int vvod;
            do {
                System.out.println("Введите число от 1 до 5");
                vvod = scanner.nextInt();
            } while (vvod>5);
            int number =vvod;
            if (number == 1){
                greetings();
            }else if (number==2){
                checkSign();
            }else if (number==3){
                selectColor();
            }else if (number==4){
                compareNumbers();
            } else if (number==5){
                addOrSubtractAndPrint();
            }
        }
        //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        public static void greetings() {
            System.out.println("Hello\nWorld\nfrom\nJava");}

    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSign() {
        int a = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        int b = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        int c = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
        int sum = a+b+c;
        if (sum>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor(){
        int data = (int)(Math.random() * ((100 - (-1)) + 1));
        if (data<=10){
            System.out.println("Красный");
        }else if (data>10 && data<=20){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers(){
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        if (a>=b){
            System.out.println("a>=b");
        } else {System.out.println("a<b");}
    }

    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true,
    // то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
    public static void addOrSubtractAndPrint() {
        boolean increment = Math.random() < 0.5;
        int initValue = (int) (Math.random()*10);
        int delta = (int) (Math.random()*10);
        if (increment){
            System.out.println(initValue+delta);
        }else {
            System.out.println(initValue-delta);
        }
    }
}
