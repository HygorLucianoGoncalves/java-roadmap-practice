package org.example.JavaAdvancedTopics.networkingSockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localHost", 1230);
        Scanner scanner = new Scanner(System.in);

        PrintStream saida = new PrintStream(socket.getOutputStream());
        String teclado = scanner.nextLine();
        saida.println(teclado);
    }
}
