package pratice;

public class Ladder {

	public static void main(String[] args) 
	{

		int marks=80;
		
		if (marks >= 35 && marks <= 50)
		{
			System.out.println("C garde");
		}
		else if (marks >= 51 && marks <=60)
		{
			System.out.println("B grade");
		}
		else if (marks >=61 && marks <=74) 
		{
			System.out.println("A");
			
		}
		else if (marks >=75 && marks <=100)
		{
		System.out.println("A+");
		}
		else 
		{
			System.out.println("fail");
		}
	}
	

}
