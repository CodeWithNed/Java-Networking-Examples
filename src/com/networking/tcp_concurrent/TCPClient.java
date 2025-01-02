package com.networking.tcp_concurrent;

import java.io.*;
import java.net.Socket;

public class TCPClient {

    TCPClient() throws IOException {

        Socket socket = new Socket("192.168.137.1", 2020);
        System.out.println("Successfully connected to the server.");

        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

        String message = in_socket.readLine();
        System.out.println("Server says " + message);
        out_socket.println("Thanks!");

        socket.close();
        System.out.println("Port 2020 closed successfully.");
    }

    public static void main(String[] args) {

        try {
            new TCPClient();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
