package OOPS;

public class This5 {

	public static void main(String[] args) {
		Animal ani = new Animal(1,2,3,4,5);
		//Hourse<Dog<Cat<Cow<Mouse

	}

}
class Animal
{
	public Animal()
	{
		this( 1,2,3,4);
		System.out.println("Dog");
	}
	public Animal(int i)
	{
		this();
		System.out.println("Cat");
	}
	public Animal(int i, int j, int k)
	{
		this(1);
		System.out.println("Cow");
	}
	public Animal(int i, int j, int k, int l)
	{
		System.out.println("Hourse");
	}
	public Animal(int i, int j, int k, int l, int m)
	{
		this(1,2,3);
		System.out.println("Mouse");
	}
}
