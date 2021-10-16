package src.basic.JavaModifiers.ForAtrMethCon;

class DefaultForAtrMethCon {

    // Modifier - default
    // Description - The class is only accessible by classes in the same package.
    // This is used when you don't specify a modifier. You will learn more about
    // packages in the Packages chapter

    String site2 = "ekosystem.org";

    public static void main(String[] args) {
        DefaultForAtrMethCon newObj2 = new DefaultForAtrMethCon();
        System.out.println(newObj2.site2);
    }
}