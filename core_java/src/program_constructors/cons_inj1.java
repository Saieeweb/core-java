package program_constructors;

public class cons_inj1 {

	public static void main(String[] args) {
		Flipkart_order first = new Flipkart_order("saiee","7865784","90876",90.9);
		System.out.println(first.mobile);
		System.out.println(first.name);
		System.out.println(first.pincode);
		System.out.println(first.price);
	

	}

}

class Flipkart_order
{
	String name;
	double price;
	String pincode;
	String mobile;
	
	public Flipkart_order
	(String mobile, String nam,String pincode)
	{
		this.name=nam;
		this.mobile=mobile;
		this.pincode=pincode;
		
	}
	public Flipkart_order
	(String nam,String mobile, String pincode, double price)
	{
		this.name=nam;
		this.mobile=mobile;
		this.pincode=pincode;
		this.price=price;
	}
	
	
}