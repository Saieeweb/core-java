package program_object;

public class csecond {

	public static void main(String[] args) {
		bike2 first = new bike2();
		bike2 first1 = new bike2(23,78);

	}

}

class bike2
{
	public bike2()
	{
		System.out.println("****");
		
	}
	public bike2(int i, int j)
	{
		System.out.println(i+j);
	}
	
	
}
