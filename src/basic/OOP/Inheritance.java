package src.basic.OOP;

class Inheritance {
    protected String carBrand = "Merceses-Benz"; // Vehicle attribute

    public void charge() { // Vehicle method
        System.out.println("Electrician charge");
    }
}

class CarType extends Inheritance {
    private String modelName = "EQ"; // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        CarType newCar = new CarType();

        // Call the charge() method (from the Vehicle class) on the myCar object
        newCar.charge();

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(newCar.carBrand + " " + newCar.modelName);
    }
}
