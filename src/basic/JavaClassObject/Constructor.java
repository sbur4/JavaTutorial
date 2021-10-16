package src.basic.JavaClassObject;

// Create a src.basic.SOLIDitvdn.SRP_1.Main class
public class Constructor {
    int x; // Create a class attribute

    // Create a class constructor for the src.basic.SOLIDitvdn.SRP_1.Main class
    public Constructor() {
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(); // Create an object of class src.basic.SOLIDitvdn.SRP_1.Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}

// Syntax of default constructor:
// <class_name>(){}

