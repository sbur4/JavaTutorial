package src.basic.IO;

import java.io.Console;

public class JavaConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String login = console.readLine("Enter login:");
            char[] password = console.readPassword("Enter pass:");

            console.printf("Login: %s \n", login);
            console.printf("Pass: %s \n", new String(password));
        }
    }
}
