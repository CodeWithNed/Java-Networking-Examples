package com.networking.tcp_concurrent;

import java.io.*;
import java.net.Socket;

public class TCPServerThread implements Runnable {

    private Socket socket;
    private TCPServerMain tcpServerMain;

    public TCPServerThread(Socket socket, TCPServerMain tcpServerMain) {
        this.socket = socket;
        this.tcpServerMain = tcpServerMain;
    }

    @Override
    public void run(){
        try{
            int clientNumber = tcpServerMain.getClientNumber();
            System.out.println("Client " + clientNumber + " at  " + socket.getInetAddress() + " has connected.");

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
            System.out.println("Client " + clientNumber + " " + socket.getInetAddress() + " has disconnected.");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
