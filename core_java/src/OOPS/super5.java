package OOPS;

public class super5 {

	public static void main(String[] args) {
		Paython first = new Paython();
		
		

	}

}
class Java
{
	int value;
	public Java(int i)
	{
		System.out.println("is parent:"+i);
		this.value=i;
	}
	public void display() {
		System.out.println(value*2);
		
	}
	
}
class Paython   extends Java
{
	public Paython ()

{
		super(100);
		super.display();
		System.out.println("is child");
		}
}