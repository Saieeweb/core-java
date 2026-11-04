package OOPS;

public class overloading {

	public static void main(String[] args) {
		School10 s=new School10();
		s.fun(10,70,30);

	}

}
class School10
{
	public void run(int i, int j)
	{
		System.out.println("*****");
	}
	public void fun(int i)
{
		System.out.println("*");
		}
	public void fun(int i, int j, int k)
	{
		System.out.println("**");
	}
}
