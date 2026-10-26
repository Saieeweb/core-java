package OOPS;

public class inheritance2 {

	public static void main(String[] args) {
		Shirt first = new Shirt();
		first.Shopping();
		System.out.println(first.price);
		System.out.println(first.newbrand);

	}

}
class Product{
	int price=1000;
	public void Shopping()
	{
		System.out.println("sale is live");
	}
}
class Shirt extends Product {
	String newbrand="H&M";
}