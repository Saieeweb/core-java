package OOPS;

public class super3 {

	public static void main(String[] args) {
		City first = new City();
	}

}
class Name1
{
	public Name1(int i)
	{
		System.out.println("Saiee");
	}
}
class City extends Name1
{
	public City()
	{
		super(23);
		System.out.println("age is 23 ");
	}
}

