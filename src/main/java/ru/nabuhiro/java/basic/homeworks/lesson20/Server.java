package ru.nabuhiro.java.basic.homeworks.lesson20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientAccept = serverSocket.accept();
            System.out.println("Client connected!");
            write(clientAccept, "Доступные операции: +,-,*,/\n Введите числа и операцию");
            String userInput = read(clientAccept);
            String result = calculate(userInput);
            write(clientAccept, result);
        }
    }

    private static String read(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String str = input.readUTF();
        System.out.println("User input:" +str);
        return str;
    }

    private static void write(Socket socket, String str) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        output.writeUTF(str);
        output.flush();
    }

    private static String calculate(String str){
        String[] splitStr = str.split(" ");
        try {
            int number1 = Integer.parseInt(splitStr[0]);
            int number2 = Integer.parseInt(splitStr[1]);

            String operation = splitStr[2];
            double result = 0;

            switch (operation){
                case "*":
                    result = number1 * number2;
                    break;
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "/":
                    if (number2 == 0){
                        throw new ArithmeticException("you can't divide by zero");
                    }
                    result = (double) number1 / number2;
                    break;
                default:
                    return "Incorrect operation";
            }

            return number1 + " " + operation + " " + number2 + " = " + result;
        } catch (NumberFormatException e){
            return "Input data incorrect";
        }
    }

}
