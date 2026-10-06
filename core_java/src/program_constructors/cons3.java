package program_constructors;

public class cons3 {

	public static void main(String[] args) {
		bank first = new bank();
		first.get();
		company first1 = new company();
		first1.display();

	}

}

class bank
{
	String name;
	int employ;
	String manager;
	int amount;
	
	bank()
	{
		name= "saiee";
		employ= 34;
		manager="pooja";
		amount=34589;
	}
	void get()
	{
		System.out.println("name="+name);
		System.out.println("employ="+employ);
		System.out.println("manager="+ manager);
		System.out.println("amount="+amount);
	}
}
class company 
{
	String name;
	int payment;
    int employ;
	int floor;
	
	company()
	{
		name="siddhi";
		payment=70000;
		employ=90;
		floor=13;
		
	}
	void display() 
	{
		System.out.println("name:"+name);
		System.out.println("payment:"+payment);
		System.out.println("employ:"+employ);
		System.out.println("floor:"+floor);
	}
}