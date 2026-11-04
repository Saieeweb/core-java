package OOPS;

public class ambiguity {

	public static void main(String[] args) {
		main(1000);
	}
	public static void main(int i) {
		System.out.println("hello from another main method..");
	}
}
class Aeroplane
{
	public static void fly ()
	{
	
	}
	public static void fly(int i)
	{
		fly ();
	}
}