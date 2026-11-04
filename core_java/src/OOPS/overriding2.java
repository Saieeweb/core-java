package OOPS;

public class overriding2 {

	public static void main(String[] args) {
Son00 son = new Son00();
son.farming();
son.farming(100);
}

}
class Father55
{
	final public void farming()
	{
		System.out.println("farming");
	}
}
class Son00 extends Father55
{
	public void farming(int j)
	{
		for (int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
	}
}
