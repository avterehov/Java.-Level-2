package ru.geekbrains.home_work_1_2_6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Server {

    public static void main(String[] args) {

        ServerSocket server = null;
        Socket socket = null;


        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен");

            socket = server.accept();
            System.out.println("Клиент подключился");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String str = null;
                        try {
                            str = in.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                        if (str.equals("/end")) {
                            break;
                        }

                        System.out.println("Получено сообщение от клиента: " + str);
                        System.out.println("Введите сообщение клиенту:");


                    }
                }
            });
            t1.setDaemon(true);
            t1.start();

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Введите сообщение клиенту:");
                        String msgSer = sc.nextLine();
                        if (msgSer.equals("/end")) {
                            break;
                        }
                        System.out.println("Отправлено клиенту: " + msgSer);
                        try {
                            out.writeUTF(msgSer);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            });

            t2.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
