package pratice;

public class ANDlog3 {

	public static void main(String[] args) {
		int salary=100000;
		char company='B';
		byte age=32;
		boolean greatemploy=true;
		float live=12;
		long workingday=300l;
		
		if (salary >= 100000 
				&& company != 'B' 
				&& age <= 32 && greatemploy == true 
				&& live != 12 && workingday == 300l)
		{
			
			System.out.println("he deserv promotion");
		}
			else {
			
				
				System.out.println("not deserv promotion");
			
		}

	}

}
