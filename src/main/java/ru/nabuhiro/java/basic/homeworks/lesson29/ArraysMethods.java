package ru.nabuhiro.java.basic.homeworks.lesson29;

public class ArraysMethods {
    public int[] ArrayAfterOne(int[] array) {
        if (array != null && array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == 1) {
                    return java.util.Arrays.copyOfRange(array, i + 1, array.length);
                }
            }
        }
        throw new RuntimeException("В массиве нет единиц");
    }

    public boolean checkOneAndTwo(int[] array) {
        boolean containsOne = false;
        boolean containsTwo = false;
        if (array != null) {
            for (int i : array) {
                if (i == 1) {
                    containsOne = true;
                }else if (i == 2) {
                    containsTwo = true;
                }else return false;
            }
        }
        return containsOne && containsTwo;
    }
}
