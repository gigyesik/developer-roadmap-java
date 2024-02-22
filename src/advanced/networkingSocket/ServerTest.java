package advanced.networkingSocket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    public ServerTest(int port) {
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started");

            System.out.println("Waiting for a client");

            socket = server.accept();
            System.out.println("Client Accepted");

            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String s = "";

            while (!s.equals("End")) {
                s = input.readUTF();
                System.out.println(s);
            }

            System.out.println("Closing Connection");

            socket.close();
            input.close();

        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static void main(String[] args) {
        ServerTest server = new ServerTest(3000);
    }
}
