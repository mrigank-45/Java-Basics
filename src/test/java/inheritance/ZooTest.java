package test.java.inheritance;

import org.junit.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals() {

        Zoo zoo = new Zoo();

        Animal[] animals = { new Dog(), new Lion(), new Tiger(), };

        zoo.feed(animals);

    }

}
