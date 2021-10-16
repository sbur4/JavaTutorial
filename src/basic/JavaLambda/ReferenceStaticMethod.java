package src.basic.JavaLambda;

// parameter -> expression
// (parameter1, parameter2) -> expression
// (parameter1, parameter2) -> { code block }

public class ReferenceStaticMethod {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = ReferenceStaticMethod::saySomething;
        // Calling interface method
        sayable.say();
    }
}

interface Sayable {
    void say();
}
