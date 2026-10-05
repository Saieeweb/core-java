package program_object;

public class local4 {

	public static void main(String[] args) {
		company first= new company();
				first.get();

	}

}

class company 
{
	public void get()
	{
		String name= "Saiee";
		int salary= 35000;
		String company_name= "TATA";
		
		System.out.println("name of employ:"+name);
		System.out.println("monthly salary:"+ salary);
		System.out.println("name of company:"+ name);
	}
	
}