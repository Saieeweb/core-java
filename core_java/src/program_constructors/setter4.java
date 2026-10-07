package program_constructors;

public class setter4 {

	public static void main(String[] args) {
		bank1 first = new bank1();
		first.setamount(200);
		System.out.println(first.getamount());

	}

}
class bank1
{
	
	String name;
	int amount;
	String manager;
	String branch;
	
public void setamount(int amou)
{
	if (amou<5000)
	{
		this.amount=amou;
		System.out.println("eligibal for loan");
	}
	else 
	{
		System.out.println("not giving loan");
	}
}
public int getamount()
{
	return this.amount;
}
	
}
