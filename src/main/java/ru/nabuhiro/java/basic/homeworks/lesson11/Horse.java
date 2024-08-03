package ru.nabuhiro.java.basic.homeworks.lesson11;

public class Horse extends Animals {
    // скорость бега 4.167 метров за 1 секунду. 15 километров в час. за n секунд получается 4.167* n секунд= расстояние. расстояние\ 4.167(скорость)=n секунд
    // 1.117 скорость плавания метров за 1 секунду. расстояние\ 1.117= n секунд. Расстояние = скорость × время
    public Horse(String name){
        this.name = name;
    }
    @Override
    public void swim(int distance) {
        // distance = endurance;
        // за один метр 1 единица выносливости
        int consumption = 4; // затраты выносливости на 1 метр бега
        int n1 = endurance / consumption;
        if (n1 < distance) {
            System.out.println("У " + name + " состояние усталости после бега");
            time = -1;
        } else {
            time = (float) distance / runningSpeed;
            endurance = endurance - (distance * consumption);
            System.out.println("Время затраченное " + name + " на бег равно: " + time + " секунд" + "\nОставшаяся выносливость: " + endurance);
        }
    }
}
