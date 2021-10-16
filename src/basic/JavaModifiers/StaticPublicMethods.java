package src.basic.JavaModifiers;

public class StaticPublicMethods {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // src.basic.SOLIDitvdn.SRP_1.Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        StaticPublicMethods myObj2 = new StaticPublicMethods(); // Create an object of src.basic.SOLIDitvdn.SRP_1.Main
        myObj2.myPublicMethod(); // Call the public method on the object
    }
}
