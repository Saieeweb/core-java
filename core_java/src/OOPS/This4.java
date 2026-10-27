package OOPS;

public class This4 {

	public static void main(String[] args) { 
		Marks first = new Marks();
		//65,45,55,75,35

	}

}

class Marks
{
	public Marks()
	{
		this(1,2,3,4);
		System.out.println("35");
	}
	public Marks(int i)
	{
		this(1,2,3);
		System.out.println("45");
	}
	public Marks(int i,int j)
	{
		this(1);
		System.out.println("55");
	}
	public Marks(int i, int j, int k)
	{
		System.out.println("65");
	}
	public Marks(int i,int j, int k, int l)
	{
		this(1,2);
		System.out.println("75");
	}
}
