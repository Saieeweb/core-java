package program_constructors;

public class setter5 {

	public static void main(String[] args) {
		compan first = new compan();
		first.setname ("rtyuj");
		System.out.println(first.getname());

	}

}

class compan
{
	int payment;
	String name;
	String customer;
	
	public void setname(String name)
	{
		if (name=="saiee")
		{
			this.name="saiee";
			System.out.println("selected for joining");
		}
		else
		{
			System.out.println("not joining");
		}
	}
	public String getname()
	{
		return this.name;
	}
}