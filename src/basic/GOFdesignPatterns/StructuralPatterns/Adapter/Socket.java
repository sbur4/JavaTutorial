package src.basic.GOFdesignPatterns.StructuralPatterns.Adapter;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
