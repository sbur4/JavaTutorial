package src.basic.JavaModifiers.ForAtrMethCon;

class PrivateForAtrMethCon {

    // Modifier - private
    // Description - The code is only accessible within the declared class

    private String site3 = "radiofg.be";

    public static void main(String[] args) {
        PrivateForAtrMethCon newObj3 = new PrivateForAtrMethCon();
        System.out.println(newObj3.site3);
    }
}