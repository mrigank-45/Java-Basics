package test.java.interfaces;

public class Porsche implements Car, Asset, Property, Loggable {

    public void drive() {
        System.out.println("Porsche driving...");
    }

    public int value() {
        return 90000;
    }

    public String owner() {
        return "Mrigank";
    }

    public String message() {
        return "I am the car of Mrigank";
    }
    
}
