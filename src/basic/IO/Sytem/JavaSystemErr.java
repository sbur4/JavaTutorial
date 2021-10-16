package src.basic.IO.Sytem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaSystemErr {
    public static void main(String[] args) {

        try {
            InputStream inPut = new FileInputStream("c:\\data\\...");
            System.out.println("File opened...");
            inPut.close();

        } catch (IOException e) {
            System.err.println("File opening failed:");
            e.printStackTrace();
        }

    }
}
