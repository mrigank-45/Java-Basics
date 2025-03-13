package test.java;

import org.junit.Test;

import test.enums.LoggingLevel;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {

        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());

    }

    @Test
    public void shouldReturnHelloMarcus() {
        Person marcus = new Person();
        assertEquals("Hello Marcus", marcus.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;
        boolean isMonday = true;
        boolean areEqual = (i == j);
        if (areEqual) {
            i = 8;
        } else if (j > i) {
            j = i - 3;
        }
        if (isMonday) {
            j++;
        }
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        Person person1;
        for (int i = 0; i < 4; i++) {
            person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[4];
        for (int i = 0; i < 4; i++) {
            persons[i] = new Person();
            persons[i].helloWorld();
        }

        for (Person person : persons) {
            person.helloWorld();
        }

        int[] numbers = new int[3]; // default value is 0
        int[] numbers2 = { 1, 2, 3 };
        System.out.println(numbers2[2]);
    }

    @Test
    public void demonstrateTwoDimensonalArrays() {

        Person[][] persons = new Person[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                persons[i][j] = new Person();
                persons[i][j].helloWorld();
            }
        }
    }

    @Test
    public String demonstrateEnumAndSwitch() {

        LoggingLevel state = LoggingLevel.PENDING;

        switch (state) {
            case PENDING:
                return "PENDING";
            case PROCESSING:
                return "PROCESSING";
            case PROCESSED:
                return "PROCESSED";
            default:
                return "DEFAULT";
        }
    }

}
