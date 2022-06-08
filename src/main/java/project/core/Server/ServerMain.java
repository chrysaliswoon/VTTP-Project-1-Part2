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
        System.out.printf("Starting shopping cart server on PORT %d... \n", PORT);
        System.out.printf("Using shoppingcart directory for persistence \n");

        // //? Wait for incoming Client connection
        Socket sock = server.accept();
        System.out.println("Connection received... \n");
        
        //? Get the input and output stream - bytes
        NetworkIO netIO = new NetworkIO(sock);

        // ? Read the incoming request from the client
        String serverUserInput = netIO.read();

        // ? Perform some operation on the request received
        // serverUserInput = serverUserInput.trim().toUpperCase();

        // ? Server will write back to the client about the data
        netIO.write(serverUserInput);
        
        //? Close the streams & socket
        netIO.close();
        sock.close();
    }
}
