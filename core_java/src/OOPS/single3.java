package OOPS;

public class single3 {

	public static void main(String[] args) {
Teach1 first1= new Teach1();
 first1.get();
first1.dis();
	}

}
class Teach{
	public void get()
	{
		System.out.println("school");
	}
}
class Teach1 extends Teach
{
	public void dis()
	{
		System.out.println("diwali is over");
	}
}
