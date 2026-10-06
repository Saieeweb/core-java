package program_constructors;

public class this2 {

	public static void main(String[] args) {
		boy first = new boy();
		first. name();

	}

}
class boy
{
	public void name()
	{
		this.class1();
		System.out.println("sudarshan");
	}
	public void age()
	{
		this.phone();
		System.out.println("he is teen");
	}
	public void class1()
	{
		this.age();
		System.out.println("he is in 10th");
		
	}
	public void phone()
	{
		
		System.out.println("vivo");
	}
}
