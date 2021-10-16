package src.basic.SOLID;

/**
 * The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
 * High-level modules should not depend on the low-level module but both should depend on the abstraction.
 */

public class DIP_5 {
}

interface Use {
    public void read();

    public void buy();
}

class Book implements Use {

    @Override
    public void read() {

    }

    @Override
    public void buy() {

    }
}

class Magazine implements Use {

    @Override
    public void read() {

    }

    @Override
    public void buy() {

    }
}

