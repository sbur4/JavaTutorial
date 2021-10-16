package src.basic.SOLID;

/**
 * The single responsibility principle states that every Java class must perform a single functionality.
 * mplementation of multiple functionalities in a single class mashup the code and if any modification
 * is required may affect the whole class.
 * It precise the code and the code can be easily maintained.
 */

public class SRP_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.addStudent();

        Print pr = new Print();
        pr.printDetails();

        Percentage per = new Percentage();
        per.calculatePercentage();
    }
}

class Student {
    public void addStudent() {
//functionality of the method
    }
}

class Print {
    public void printDetails() {
//functionality of the method
    }
}

class Percentage {
    public void calculatePercentage() {
//functionality of the method
    }
}

