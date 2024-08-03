package ru.nabuhiro.java.basic.homeworks.lesson11;

public abstract class Animals {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;
    float time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public void run(int distance){
        // distance = endurance;
        // за один метр 1 единица выносливости
        int consumption = 1; // затраты выносливости на 1 метр бега
        int n1 = endurance/ consumption;
        if(n1< distance){
            System.out.println("У " + name + " состояние усталости после бега");
            time = -1;
        } else {
            time = (float) distance / runningSpeed;
            endurance = endurance-(distance * consumption);
            System.out.println("Время затраченное " + name + " на дистанцию " + distance + " метров равно: " + time + " секунд" + "\nОставшаяся выносливость: " + endurance);
        }
        /*
        if (time > endurance){
            System.out.println("У " + name + " состояние усталости после бега");
            time = -1;
        }
        for (int i = 1; i <= distance; i= (int) (i*runningSpeed)) {
            endurance--;
            if (endurance == 0){
                System.out.println("У " + name + " состояние усталости после бега");
                time = -1;
            }
        }
        time =(float) distance/runningSpeed;
        */
        //  distance \ runningSpeed = time
    }
    public void info(){
        if (endurance ==0){
            System.out.println(name + "состояние усталости");
        }
        System.out.println(name + " выносливость: " +endurance);

    }
    public abstract void swim(int distance);
}
/*Создайте классы Cat, Dog и Horse с наследованием от класса Animal
У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
Затраты выносливости:
Все животные на 1 метр бега тратят 1 ед выносливости,
Собаки на 1 метр плавания - 2 ед.
Лошади на 1 метр плавания тратят 4 единицы
Кот плавать не умеет.
Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время,
затраченное на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает,
 то возвращаем время -1 и указываем что у животного появилось состояние усталости.
 При выполнении действий пишем сообщения в консоль.
Добавляем метод info(), который выводит в консоль состояние животного.*/