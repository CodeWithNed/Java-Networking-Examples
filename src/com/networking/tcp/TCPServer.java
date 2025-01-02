package com.networking.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public TCPServer() throws IOException {

        ServerSocket serverSocket = new ServerSocket(2020);
        System.out.println("Port 2020 is open");

        Socket socket = serverSocket.accept();
        System.out.println("Client " + socket.getInetAddress() + " has connected.");

        // IO Buffer
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader in_socket = new BufferedReader(inputStreamReader);

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        PrintWriter out_socket = new PrintWriter(outputStreamWriter,true);

        out_socket.println("Welcome to TCP Server!");
        String message = in_socket.readLine();
        System.out.println("Client says " + message);

        socket.close();
        System.out.println("Socket is closed!");
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
