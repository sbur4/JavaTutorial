package src.basic.JavaModifiers.ForAtrMethCon;

class Banksy {

    // Modifier - protected
    // Description - The code is accessible in the same package and subclasses. You
    // will learn more about subclasses and superclasses in the Inheritance chapter

    protected String site4 = "banksy.co.uk";
}

class ProtectedForAtrMethCon extends Banksy {

    public static void main(String[] args) {
        ProtectedForAtrMethCon newObj4 = new ProtectedForAtrMethCon();
        System.out.println(newObj4.site4);
    }
}