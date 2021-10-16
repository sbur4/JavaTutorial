package src.basic.IO.InputStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt ");
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }

}
