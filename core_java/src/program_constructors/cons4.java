package program_constructors;

public class cons4 {

	public static void main(String[] args) {
		india first = new india();
		first.get();

		
		
		
	}

}

class india
{
	String name;
	int state;
	String PM;
	int numofCM;
	String small_state;
	
	india()
	{
		name= "india";
		state=28;
		PM="modi";
		numofCM=28;
		small_state="goa";
		
	}
	void get()
	{
		System.out.println("name:"+name);
		System.out.println("state:"+state);

		System.out.println("PM:"+PM);
		

		System.out.println("numofCM:"+numofCM);
		

		System.out.println("small_state:"+small_state);

	}
	
}