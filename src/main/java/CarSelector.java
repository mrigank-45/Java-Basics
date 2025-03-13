package main.java;

// compile: javac -d target src/main/java/CarSelector.java
// run: java -cp target main.java.CarSelector BMW Audi Tesla

public class CarSelector {

    public static void main(String[] arguments) {
        for (String argument : arguments) {
            System.out.println("processing car: " + argument);
        }
    }

}
