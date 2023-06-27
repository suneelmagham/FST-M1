package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}

class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    //create constructor
    int numOfTyres;
    int numOfDoors;

    public Car() {
        //constructor
        numOfTyres = 4;
        numOfDoors = 4;
    }

    //Class Methods
    public void displayCharacterstics() {
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}