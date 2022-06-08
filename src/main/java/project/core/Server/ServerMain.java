package project.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ServerMain {
    public static void main(String[] args) throws IOException {

        //? Establish PORT number
        Integer PORT = 3000;
    
        //? Create a server socket and listen to a port
        ServerSocket server = new ServerSocket(PORT);
        System.out.printf("Waiting for connection on PORT %d... \n", PORT);


        // //? Wait for incoming Client connection
        Socket sock = server.accept();
        System.out.println("Connection accepted \n");
        
        //? Get the input and output stream - bytes
        NetworkIO netIO = new NetworkIO(sock);
        
        //? Close the streams & socket
        netIO.close();
        sock.close();
    }
}
