package program_object;

public class method_1 {

	public static void main(String[] args) {
		
		Car first = new Car();
		first.Start();
		int num=first.price();
		System.out.println(num);
	}

}

class Car
{
	public void Start() {
		System.out.println("the car is starting");
	}
	public int price()
	{
		return 300000;
	}
}
