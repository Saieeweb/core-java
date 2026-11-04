package OOPS;

public class overriding {

	public static void main(String[] args) {
		Son32 son = new Son32();
		son.farming();

	}

}
class Father23{
	public void farming()
	{
		System.out.println("farming");
		
	}
}
	class Son32 extends Father23{
		
		public void farming()
		{
			System.out.println("tractors...");
		}
	}


	


