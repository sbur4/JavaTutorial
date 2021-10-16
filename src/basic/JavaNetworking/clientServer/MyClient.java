package src.basic.JavaNetworking.clientServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    private static final String HOST = "localhost";
    private static final int PORT = 55555;

    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket(HOST, PORT);
            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {
                String line = "Hello";
                out.write(line.getBytes());
                out.flush();

                byte[] data = new byte[32 * 1024];
                int readBytes = in.read(data);
                System.out.printf("Server> %s", new String(data, 0, readBytes));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
