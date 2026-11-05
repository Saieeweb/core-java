package OOPS;

public class overriding3 {

	public static void main(String[] args) {
		Car11 c = new Bike();
		c.Driver();
		

	}

}
class Car11
{
	public void Driver() {
		System.out.println("Car is on the road");
	}
}
class Bike extends Car11{
	public void Driver() {
		System.out.println("Car is on the parking");
	}
}
