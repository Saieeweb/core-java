package OOPS;

public class overhide2 {

	public static void main(String[] args) {
		Veh v = new Veh();
		v.wheel();
		Car22 c = new Car22();
		c.wheel();
		Bike89 b = new Bike89();
		b.wheel();

	}

}

class Veh{
	public void wheel() {
		System.out.println("ride safely");
	}
}
class Car22 extends Veh{
	public void wheel() {
		System.out.println("car has 4 wheel");
	}
}
class Bike89 extends Veh{
	public void wheel() {
		System.out.println("Bike is on the road");
	}
}