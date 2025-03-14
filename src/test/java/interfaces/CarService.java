package test.java.interfaces;

public class CarService {

    public static void main() {
		// **normal way
		// BMW bmw = new BMW();
		// Porsche porsche = new Porsche();
		// Mercedes mercedes = new Mercedes();
		// bmw.drive();
		// porsche.drive();
		// mercedes.drive();

		// **referencing using the interface
		Car bmw = new BMW();
		Car porsche = new Porsche();
		Loggable mercedes = new Mercedes();
		bmw.drive();                         // can only access the methods defined in the interface
		porsche.drive();
		System.out.println(mercedes.message());
	}
    
}
