package test.java.polymorphism;

public abstract class Animal {  // one method is abstract, so the class must be abstract

    public abstract void eat();

    public void grow() {
        System.out.println("Animal is growing...");
    }

}
