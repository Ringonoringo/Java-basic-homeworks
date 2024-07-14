package ru.nabuhiro.java.basic.homeworks.lesson3;

public class MainApplication {
        public static void main(String[] args) {
            //Каждый метод последовательно вызовите из метода main()
            greetings();
        }
        //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
        public static void greetings() {
            System.out.println("Hello\nWorld\nfrom\nJava");}
}
