package ru.nabuhiro.java.basic.homeworks.lesson20;

import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8888);
             Ping client = new Ping(socket)) {
            System.out.println(client.read());
            String UserInput = scanner.nextLine();
            client.send(UserInput);
            System.out.println(client.read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
