package ru.nabuhiro.java.basic.homeworks.lesson21;

public class MathTask implements Runnable {
    double[] array;
    int path1;
    int path2;

    public MathTask(double[] array, int path1, int path2) {
        this.array = array;
        this.path1 = path1;
        this.path2 = path2;
    }

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());
        for (int i = path1; i < path2; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
