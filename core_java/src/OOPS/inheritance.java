package OOPS;

public class inheritance {

	public static void main(String[] args) {
		Father first = new Father();	

		first.farming();
		System.out.println(first.jameen);

	}

}

class Father
{
	int jameen=100;
	public void farming()
	{
		System.out.println("farming technique");
	}
}

class Son extends Father
{
	String car="city";
}
