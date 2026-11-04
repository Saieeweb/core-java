package OOPS;

public class mainmethod {

	public static void main(String[] args) {
		Son son = new Son();
		son.farming();

	}

}
class Father{
	public void farming()
	{
		System.out.println("farming");
		
	}
}
	class Son extends Father{
		
		public void farming()
		{
			System.out.println("tractors...");
		}
	}

