package test.java.interfaces;

public class Mercedes implements Car, Asset, Property, Loggable {

    public void drive() {
        System.out.println("Mercedes driving...");
    }

    public int value() {
        return 80000;
    }

    public String owner() {
        return "Mrigank";
    }

    public String message() {
        return "I am the car of Mrigank";
    }
    
}
