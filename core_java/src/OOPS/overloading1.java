package OOPS;

public class overloading1 {

	public static void main(String[] args) {
Calculator cal=new Calculator();
cal.add(90);
	}

}
class Calculator
{
	public void add(int i, int j)
	{
		System.out.println("**");
		
	}
	public void add (int i, int j, int k)
	{
		System.out.println("*");
	}
	public void add(int i)
	{
		System.out.println("***");
	}
}