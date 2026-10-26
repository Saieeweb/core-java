package OOPS;

public class inheritance3 {

	public static void main(String[] args) {
		Manager first = new Manager();
		first.hospital();
		System.out.println(first.staff);
		System.out.println(first.name);

	}

}

class Doctor{
	int staff=10;
	public void hospital()
	{
		System.out.println("golden care");
	}
}
class Manager extends Doctor{
	String name="city hospital";
}