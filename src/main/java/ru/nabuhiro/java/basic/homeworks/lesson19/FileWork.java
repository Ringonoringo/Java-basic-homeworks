package ru.nabuhiro.java.basic.homeworks.lesson19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) throws IOException {
        showTxtFile();
        workingWithFile();
    }

    public static void showTxtFile() {
        try {
            File dir = new File("./");
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            };
            File[] files = dir.listFiles(filter);
            for (File file : files) {
                System.out.println("Список txt файлов: " + file.getName());
            }
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void workingWithFile() throws IOException{
        System.out.println("С каким файлом вы хотите работать:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("Содержимое " + fileName + " :");
        showFile(fileName);

        System.out.println("\nВведите строку для записи в файл:");
        Scanner scannerForString = new Scanner(System.in);
        String string = scannerForString.nextLine();
        writeToFile(string, fileName);
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
}

/*Реализуйте приложение, позволяющее работать с текстовыми файлами
При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
Далее программа запрашивает имя файла, с которым хочет работать пользователь
Содержимое файла выводится в консоль
Затем любую введенную пользователем строку необходимо записывать в указанный файл*/