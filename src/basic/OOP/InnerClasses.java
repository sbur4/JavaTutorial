package src.basic.OOP;

class OuterClass {
    int my1 = 5;

    class InnerClass {
        int my2 = 3;
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myOuter.my1 + myInner.my2);
    }

}
