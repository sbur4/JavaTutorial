package src.basic.JavaPolymorphism.Binding;

public class StaticBinding {
    private void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {
        StaticBinding dog = new StaticBinding();
        dog.eat();
    }
}
