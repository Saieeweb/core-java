package OOPS;

public class overriding5 {

	public static void main(String[] args) {
Bank first = new SBI();
first.second();
	}

}

class Bank{
	public void second()
	{
		System.out.println("***");
		
	}
	
}
class SBI extends Bank{
	public void second() {
		
	
	
System.out.println("********");
}
}
