package test.java.polymorphism;

public class Zoo {

    public void feed(Animal[] animals) {

        for (Animal animal : animals) {
            animal.eat();
            animal.grow();
        }
    }

}
