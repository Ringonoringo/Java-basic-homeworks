package ru.nabuhiro.java.basic.homeworks.lesson3;

public class MainApplication {
        public static void main(String[] args) {
            //Каждый метод последовательно вызовите из метода main()
            greetings();
            checkSign(1,-5,3);
        }
        //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        public static void greetings() {
            System.out.println("Hello\nWorld\nfrom\nJava");}

    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSign(int a,int b,int c) {
        int sum = a+b+c;
        if (sum>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
