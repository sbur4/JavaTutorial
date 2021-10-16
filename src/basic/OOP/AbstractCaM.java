package src.basic.OOP;

// Abstract class
abstract class AbstractCaM {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig4 extends AbstractCaM {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main4 {
    public static void main(String[] args) {
        Pig4 myPig = new Pig4(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}