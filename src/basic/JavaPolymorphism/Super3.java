package src.basic.JavaPolymorphism;

class Animal3 {
    Animal3() {
        System.out.println("animal is created");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super();
        System.out.println("dog is created");
    }
}

class Super3 {
    public static void main(String args[]) {
        Dog3 d = new Dog3();
    }
}