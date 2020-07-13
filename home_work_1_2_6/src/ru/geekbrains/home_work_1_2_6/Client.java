package ru.geekbrains.home_work_1_2_6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        final String SERVER_ADDR = "localhost";
        final int SERVER_PORT = 8189;
        Socket socket = null;
        DataOutputStream out;
        DataInputStream in;
        try{

            socket = new Socket(SERVER_ADDR,SERVER_PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Клиент подключен");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while(true){
                    System.out.println("Введите сообщение серверу:");
                    String msgCl = sc.nextLine();

                    System.out.println("Отправлено серверу:" + msgCl);

                     try {
                        out.writeUTF(msgCl);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();

         Thread t2 =    new Thread(new Runnable() {
                @Override
                public void run() {

                    while (true) {
                        String str = null;
                        try {
                            str = in.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Получено сообщение от сервера: " + str);
                        System.out.println("Введите сообщение серверу:");

                    }
                }
            });

         t2.setDaemon(true);
         t2.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







