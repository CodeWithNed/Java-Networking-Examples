package com.networking.tcp_concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMain {

    public TCPServerMain() throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020);
        System.out.println("Port 2020 is open");

        // Wait for new connections
        while(true){
            Socket socket = serverSocket.accept();
            TCPServerThread tcpServerThread = new TCPServerThread(socket, this);
            Thread thread = new Thread(tcpServerThread);
            thread.start();
        }

    }

    private int clientNumber = 1;

    public int getClientNumber(){
        return clientNumber++;
    }

    public static void main(String[] args) {
        try {
            new TCPServerMain();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
