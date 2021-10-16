package src.basic.JavaClasses;

public class JavaClass { // top level class

    static class A {
    } // nested class

    class B {
    } // inner class

    void m() {
        class C {
        } // local inner class

        abstract class D {
        } // local inner abstract class

        new G() {
        };// anonymous inner class

        new G1() {
        };// anonymous inner class
    }

}

class G {
}

interface G1 {
}
