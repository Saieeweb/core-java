package program_object;

public class Cfirst {

	public static void main(String[] args) {
		Bike1 first = new Bike1();
		first.mileage=78;
		System.out.println(first.mileage);

	}

}

class Bike1
{
	int mileage;
	public Bike1()
	{
		System.out.println("ride fast");
	}
}
