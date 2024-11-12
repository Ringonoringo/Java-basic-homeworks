package ru.nabuhiro.java.basic.homeworks.lesson27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) throws IOException {
        showTxtFile();
        String fileName, substring;
        System.out.println("С каким файлом вы хотите работать:");
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
        showFile(fileName);
        System.out.println("\nВведите искомую последовательность символов для поиска в файле:");
        Scanner scannerForString = new Scanner(System.in);
        substring = scannerForString.nextLine();
        System.out.println(findConsistencyWR(fileName, substring));

    }

    public static void showTxtFile() {
        try {
            File dir = new File("./");
            FilenameFilter filter = (dir1, name) -> name.endsWith(".txt");
            File[] files = dir.listFiles(filter);
            assert files != null;
            for (File file : files) {
                System.out.println("Список txt файлов: " + file.getName());
            }
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void workingWithFile() {
        System.out.println("С каким файлом вы хотите работать:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("Содержимое " + fileName + " :");
        showFile(fileName);

        System.out.println("\nВведите строку для записи в файл:");
        Scanner scannerForString = new Scanner(System.in);
        String substring = scannerForString.nextLine();
        writeToFile(substring, fileName);
        showFile(fileName);

    }

    public static void showFile(String fileName) {
        try (InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String string, String fileName) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int findConsistencyWR(String fileName, String substring) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(substring, index)) != -1) {
                    count++;
                    index += substring.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}

/*Реализуйте метод, который подсчитывает сколько раз в текстовом файле (с кодировкой UTF-8)
встречается указанная последовательность символов с учетом регистра;
При запуске приложения пользователь вводит имя файла и искомую последовательность символов,
программа должна выполнить расчет и напечатать результат в консоль.*/