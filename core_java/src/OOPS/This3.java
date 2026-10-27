package OOPS;

public class This3 {

	public static void main(String[] args) {
		Car first = new Car();
//DBCA
	}

}
class Car 
{
	public Car()
	{
		this(10,20);
		System.out.println("A");
	}
	public Car( int i)
	{
		this(10,20,30);
		System.out.println("B");
	}
	public Car(int i, int j)
	{
		this(10);
		System.out.println("C");
	}
	public Car(int i, int j, int k)
	{
		System.out.println("D");
	}
	
	
}