package src.basic.GOFdesignPatterns.StructuralPatterns.Bridge;

/**
 * Мост — это структурный паттерн проектирования, который разделяет один или несколько классов на
 * две отдельные иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга.
 */

public abstract class Shape3 {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape3(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
