package src.basic.OOP;

public class Encapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    //

    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("Dnepr");
        System.out.println(myObj.getName());

    }
}
