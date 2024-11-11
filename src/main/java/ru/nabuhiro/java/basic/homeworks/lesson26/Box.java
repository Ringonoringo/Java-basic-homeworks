package ru.nabuhiro.java.basic.homeworks.lesson26;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Box<T extends Fruit> {
    private List<T> Box;

    public Box() {
        this.Box = new ArrayList<>();
    }

    @SafeVarargs
    public final void putFruit(T... fruits) {
        Box.addAll(Arrays.asList(fruits));
    }

    public int weight() {
        int weight = 0;
        if (!Box.isEmpty()) {
            for (Fruit fruit : Box) {
                weight += fruit.getWeight();
            }
            return weight;
        }
        return 0;
    }

    public boolean compare(Box compareBox) {
        return this.weight() == compareBox.weight();
    }
    public void moveFruits(Box<? super T> secondBox) {
        if (!Box.isEmpty()) {
            secondBox.Box.addAll(Box);
            Box.clear();
        }
    }
}