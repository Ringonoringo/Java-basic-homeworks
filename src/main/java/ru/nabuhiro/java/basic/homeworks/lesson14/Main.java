package ru.nabuhiro.java.basic.homeworks.lesson14;

public class Main {
    public static void main(String[] args) {
        String[][] arrayNot4 = {{"e", "4", "2", "4"}, {"3", "6", "3"}, {"o", ",", "5", "5", "5", "5"}};
        String[][] array = {{"1", "1", "1", "1"}, {"A", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] array1 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            sumElements(arrayNot4);
            sumElements(array);
            sumElements(array1);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Перехватили исключение");
            e.printStackTrace();
        }
        System.out.println("Завершение работы");
    }

    public static void sumElements(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new AppArraySizeException("Массив не равен 4Х4");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Преобразование не удалось." + " В ячейке [" + i + "],[" + j + "] лежит текст [" + array[i][j] + "] вместо числа");
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
/*Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
 должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() необходимо вызвать полученный метод,
обработать возможные исключения AppArraySizeException и AppArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
*/