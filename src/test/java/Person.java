package test.java;

public class Person {
    
    private Name personName;
    private static int personCounter;
    
    // final is like const in C++
    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    public Person() {
        personCounter++;
    }

    public Person(Name personName) { // Constructor
        this.personName = personName;
        personCounter++;
    }

    public static int numberOfPersons() {
        return personCounter;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

}
