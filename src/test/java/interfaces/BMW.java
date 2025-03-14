package test.java.interfaces;

public class BMW implements Car, Asset, Property, Loggable {

    public void drive() {
        System.out.println("BMW driving...");
    }

    public int value() {
        return 50000;
    }

    public String owner() {
        return "Mrigank";
    }

    public String message() {
        return "I am the car of Mrigank";
    }

}
