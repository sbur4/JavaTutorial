package src.basic.IO.InputStream;

import java.io.*;

public class FilterInputStreamExample {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File data = new File("D:\\testout.txt");
        FileInputStream file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k = 0;
        while ((k = filter.read()) != -1) {
            System.out.print((char) k);
        }
        file.close();
        filter.close();
    }
}
