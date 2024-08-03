package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Dog extends Animals {
    // скорость собаки 15 км.час 4.167 метра в секунду Расстояние = скорость × время. время =расстояние\ скорость
    // скорость плавания 1 м.сек
    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance){
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }
    @Override
    public void swim(int distance) {
        // distance = endurance;
        // за один метр 1 единица выносливости
        int consumption = 2; // затраты выносливости на 1 метр бега
        int n1 = endurance / consumption;
        if (n1 < distance) {
            System.out.println("У " + name + " состояние усталости. " + name + " не проплывет такую дистанцию");
            time = -1;
        } else {
            time = (float) distance / runningSpeed;
            endurance = endurance - (distance * consumption);
            System.out.println("Время затраченное " + name + "на заплыв: " + distance +" метров " + time + " секунд" + "\nОставшаяся выносливость: " + endurance);
        }
    }
}
