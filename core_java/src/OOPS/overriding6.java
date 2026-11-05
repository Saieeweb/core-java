package OOPS;

public class overriding6 {

	public static void main(String[] args) {
Car23 c = new Car23();
Bike33 b = new Bike33();
Bus44 bus = new Bus44();

c.start();
b.start();
bus.start();
	}

}
class Vehical90{
	public void start() {
		System.out.println("vehical is starting");
	}
}
class Car23 extends Vehical90{
	public void start() {
		System.out.println("Car is starting");
	}
}
class Bike33 extends Vehical90{
	public void start() {
		System.out.println("Bike is on the parking");
	}
}
class Bus44 extends Vehical90{
	public void start() {
		System.out.println("Bus is on the stand");
	}
}
