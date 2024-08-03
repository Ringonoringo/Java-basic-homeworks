package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Cat extends Animals {
    // скорость кошки 10 км.час 2.777 метров в секунду. время= расстояние\скорость  Расстояние = скорость × время
   public Cat(String name, int runningSpeed, int endurance){
       this.name = name;
       this.runningSpeed = runningSpeed;
       this.endurance = endurance;
   }
    @Override
    public void swim(int distance) {
        System.out.println(name + " на берегу, т.к не умеет плавать");
    }
}
