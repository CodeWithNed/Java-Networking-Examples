package com.networking.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public TCPServer() throws IOException {

        ServerSocket serverSocket = new ServerSocket(2020);
        System.out.println("Port 2020 is opened.");

        Socket socket = serverSocket.accept();
        InetAddress IPAddress = socket.getInetAddress();
        System.out.println(IPAddress.getHostAddress());

        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

        out_socket.println("Welcome!");
        System.out.println("Client says " + in_socket.readLine());

        socket.close();
        System.out.println("Port 2020 is closed");
    }

    public static void main(String[] args) {

        try {
            new TCPServer();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
