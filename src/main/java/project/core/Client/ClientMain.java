package project.core;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Integer PORT = 3000;
        String URL = "localhost"; // 127.0.0.1 = localhost (my computer)
        System.out.printf("Connected to the server %s on PORT %d \n", URL, PORT);

        // ? Connect to the ServerMain
        Socket sock = new Socket(URL, PORT);
        System.out.println("Connected to the Server \n");

        //? Get the input and output stream - bytes
        NetworkIO netIO = new NetworkIO(sock);

        //? Close the streams & socket
        netIO.close();
        sock.close();

    }

}
