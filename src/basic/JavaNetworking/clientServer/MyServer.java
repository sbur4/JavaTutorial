package src.basic.JavaNetworking.clientServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private static final int PORT = 55555;

    public static void main(String[] args) {
        ServerSocket severSocet = null;
        try {
            severSocet = new ServerSocket(PORT);
            System.out.println("Started, waiting for connection");
            Socket socket = severSocet.accept();
            System.out.println("Accepted. " + severSocet.getInetAddress());

            try (InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {

                byte[] buf = new byte[32 * 1024];
                int readBytes = in.read(buf);
                String line = new String(buf, 0, readBytes);
                System.out.printf("Client> %s", line);

                out.write(line.getBytes());
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
