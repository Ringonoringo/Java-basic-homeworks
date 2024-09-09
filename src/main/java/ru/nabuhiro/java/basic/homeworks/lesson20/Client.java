package ru.nabuhiro.java.basic.homeworks.lesson20;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {


        try(Socket socket = new Socket("localhost", 8888);
            Ping client = new Ping(socket)
        ) {
            System.out.println(client.read());
            System.out.println("Введите через пробелы два числа и операцию");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            client.send(userInput);
            System.out.println(client.read());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
