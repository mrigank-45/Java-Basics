package test.java.equals;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void primitivesShouldBeEqual() {
        int i = 4;
        int j = 4;
        assertTrue(i == j); // True
    }

    @Test
    public void stringShouldBeEqual() {
        String hello1 = "Hello";
        String hello2 = "Hello";
        assertTrue(hello1 == hello2); // True, as both refer to the same memory location

        String hello3 = "H";
        hello3 = hello3 + "ello"; // Creates a new String object in heap
        assertTrue(hello1 == hello3); // False, as they are different objects

        assertTrue(hello1.equals(hello3));  // True, as it checks character-by-character equality
    }

    @Test
    public void porscheShouldBeEqual() {
        Car myPorsche1 = new Car("Mrigank", "Porsche", "silver");
        Car myPorsche2 = new Car("Mrigank", "Porsche", "silver");
        assertTrue(myPorsche1.equals(myPorsche2));  // False if equals() is not overridden
    }

}
