package org.example.JavaFundamentals.networkingSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingSockets {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1230);
        Socket socket = serverSocket.accept();
        System.out.println("Cliente Conectou");

        InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
        PrintStream saida = new PrintStream(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(inputReader);

        String x;
        while ((x = reader.readLine()) != null){
            saida.println("Servidor: "+ x );
        }


    }

}
