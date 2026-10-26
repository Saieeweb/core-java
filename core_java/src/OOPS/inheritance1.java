package OOPS;

public class inheritance1 {

	public static void main(String[] args) {
		S first = new S();
		first.farming();
		System.out.println(first.jameen);
		System.out.println(first.car);
		
		

	}

}
class Ft{
	int jameen=100;
	public void farming()
	{
		System.out.println("farming");
	}
}
	class S extends Ft
	{
		String car="city";
	}

