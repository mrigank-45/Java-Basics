package test.java.dataTypes;

import org.junit.Test;
import static org.junit.Assert.*; // imports only static methods of Assert class

public class DemoTest {

    @Test
    public void shouldDemonstrateStaticImport() {
        assertTrue(true);
    }

    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private Object myObject;
    private boolean myBoolean;
    private char myChar;

    @Test
    public void shouldDemonstrateDataTypeDefaultValues() {
        System.out.println("byte default value: " + myByte); // prints 0
        System.out.println("short default value: " + myShort); // prints 0
        System.out.println("int default value: " + myInt); // prints 0
        System.out.println("long default value: " + myLong); // prints 0
        System.out.println("float default value: " + myFloat); // prints 0.0
        System.out.println("double default value: " + myDouble); // prints 0.0
        System.out.println("Object default value: " + myObject); // prints null
        System.out.println("boolean default value: " + myBoolean); // prints false
        System.out.println("char default value: " + myChar); // prints empty character
        System.out.println("char default value as int: " + (int) myChar); // prints 0
    }

    @Test
    public void shouldDemonstrateBases() {
        int binary = 0B10;
        int baseEight = 017;
        int hex = 0xA;
        System.out.println(binary);  // prints 2
        System.out.println(baseEight); // prints 15
        System.out.println(hex); // prints 10
    }

}
