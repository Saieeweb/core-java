package program_object;

public class static4 {

	public static void main(String[] args) {
		Boy first = new Boy();
		Boy second = new Boy();
		
		first.age=45;
		
		System.out.println(first.age);
		System.out.println(second.age);
				

	}

}

class Boy
{
	int age;
	{
		age= 23;
	}
	
}
