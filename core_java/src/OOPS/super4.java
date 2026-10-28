package OOPS;

public class super4 {

	public static void main(String[] args) {
		Orange first = new Orange();
		

	}

}
class Fruit
{
	public Fruit(int i, int j)
	{
		System.out.println("Mango is sweet");
	}
}
class Orange extends Fruit
{
	public Orange()
	{
		super(10,20);
		System.out.println("Orange is colour");
	}
}
