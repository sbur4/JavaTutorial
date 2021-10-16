package src.basic.GOFdesignPatterns.StructuralPatterns.Proxy;

/*
 * Заместитель — это структурный паттерн проектирования, который позволяет подставлять
 * вместо реальных объектов специальные объекты-заменители. Эти объекты перехватывают вызовы к оригинальному объекту,
 * позволяя сделать что-то до или после передачи вызова оригиналу.
 */

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}
