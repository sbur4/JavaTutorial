package src.basic.JavaLogging;

import java.util.logging.Logger;

public class JulExample {

    public static final Logger LOGGER = Logger.getLogger(JulExample.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello");
        LOGGER.fine("Fine");
        LOGGER.severe("Error");
        LOGGER.warning("Warning");
    }
}