package program_object;

public class this1 {

	public static void main(String[] args) {
Animal first=new Animal();
first.run();
	}

}

class Animal
{
	public void run()
	{
		this.sleep();
		System.out.println("tiger is running");
	}
	public void sleep()
	{
		
		System.out.println("tiger is slepping");
	}
	public void alert()
	{
		this.run();
		System.out.println("tiger is slepping");
	}
	}
