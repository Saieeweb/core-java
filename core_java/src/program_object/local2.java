package program_object;

public class local2 {

	public static void main(String[] args) {
		State first = new State();
		first.get();
		State second = new State();
		second.display();
		State third = new State();
		third.get1();
//country fourth = new country();
//first.get();
country fifth = new country();
fifth.display();
fifth.get();

	}

}

class State
{
	public void get()
	{
		String name= "Goa";
	System.out.println("smallest state=" +name);
	}
	public void display()
	{
		int number=45;
		System.out.println("number of City="+ number);
	}
	public void get1()
	{
		String name = "CM";
		System.out.println("CM of goa="+ name);
	}
}
class country
{
	public void get()
	{
		String name= "india";
		System.out.println("best country="+name);
	}
	public  void display()
	{
		int number= 109;
		System.out.println("number of country="+number);
	}
	
	
	
}
