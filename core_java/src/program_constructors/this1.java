package program_constructors;

public class this1 {

	public static void main(String[] args) {

		birds first = new birds();
		first.stop();
	}

}
class birds
{
	public void fly()
	{
		this.eat();
		System.out.println("birds are flying");
	}
	public void stop()
	{
		this.fly();
		System.out.println("birds are stoped");
		
	}
	public void eat()
	{
		System.out.println("birds are eating");
	}
	
	
}
