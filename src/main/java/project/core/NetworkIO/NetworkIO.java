package project.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NetworkIO {
    private InputStream is;
    private OutputStream os;
    private DataInputStream dis;
    private DataOutputStream dos;

    // ? Get the input and output stream - bytes
    public NetworkIO(Socket sock) throws IOException {
        is = sock.getInputStream();
        dis = new DataInputStream(is); // For incoming stream
        os = sock.getOutputStream();
        dos = new DataOutputStream(os); // For outgoing stream
    }

    //? Close the streams & socket
    public void close() throws IOException {
        is.close();
        os.close();
    }

}
