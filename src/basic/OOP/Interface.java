package src.basic.OOP;

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("RADIO FG ANTWERPEN");
    }

    public void myOtherMethod() {
        System.out.println("https://www.radiofg.be/");
    }
}

public class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
