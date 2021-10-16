package src.basic.JavaPolymorphism.Blocks;

class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class Main extends A {
    Main() {
        super();
        System.out.println("child class constructor invoked");
    }

    Main(int a) {
        super();
        System.out.println("child class constructor invoked " + a);
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String args[]) {
        Main b1 = new Main();
        Main b2 = new Main(10);
    }
}
