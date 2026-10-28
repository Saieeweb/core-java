package OOPS;

public class super_class {

	public static void main(String[] args) {
		Tiger second = new Tiger();
		
		
	}
	
}

class Animal1
{
	public Animal1(int i, int j)
	{
		System.out.println("animals are in the zoo");
	}
}
class Tiger extends Animal1
{
	public Tiger()
	{
		super(10,20);
		System.out.println("Tiger is not in the zoo");
	}
}