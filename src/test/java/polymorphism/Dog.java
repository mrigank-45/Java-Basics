package test.java.polymorphism;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating...");
    }

    // overriding the grow method
    public void grow() {
        System.out.println("Dog is not growing...");
    }
    
}
