package src.basic.JavaModifiers.NonAccessModifiers;

abstract class AbstractNonAccess {
    public String myCode = "JAVA";

    public abstract void study(); // abstract method
}

class Student extends AbstractNonAccess {

    // Modifier - abstract
    // Description - The class cannot be used to create objects (To access an
    // abstract class, it must be inherited from another class. You will learn more
    // about inheritance and abstraction in the Inheritance and Abstraction
    // chapters)
    public void study() {
        System.out.println("Studying all day long");
    }
}