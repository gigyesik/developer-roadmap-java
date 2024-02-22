package advanced.networkingSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientTest {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public ClientTest(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // 입력 받기
            input = new DataInputStream(System.in);

            // 소켓에 출력 보내기
            output = new DataOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            System.out.println("IOException");
        }

        String s = "";

        while (!s.equals("End")) {
            try {
                s = input.readLine();
                output.writeUTF(s);
            } catch (IOException e) {
                System.out.println("IOException");
            }
        }

        try {
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    public static void main(String[] args) {
        ClientTest client = new ClientTest("127.0.0.1", 3000);
    }
}
