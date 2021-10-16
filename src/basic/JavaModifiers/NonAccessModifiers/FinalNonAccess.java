package src.basic.JavaModifiers.NonAccessModifiers;

class InnerFinal {
    protected String brand = "NEXT";

    public void buy() {
        System.out.println("Oh, yeah!");
    }
}

class FinalNonAccess extends InnerFinal {

    // Modifier - final
    // Description - The class cannot be inherited by other classes (You will learn
    // more about inheritance in the Inheritance chapter)

    public static void main(String[] args) {
        FinalNonAccess newObj5 = new FinalNonAccess();
        System.out.println(newObj5.brand);
    }
}