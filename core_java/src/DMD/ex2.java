package DMD;

public class ex2 {

	public static void main(String[] args) {
		int mark=35;
		
		try {
		if (mark<45)
		{
			throw new Exception("****");
		}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("GOOD MORNING");
}
}