package program_object;

public class global2 {

	public static void main(String[] args) {
		book first = new book();
		first.buying_book();

	}

}
class book
{
	public void buying_book()
	{
		System.out.println("selling books in shop");
		System.out.println("book price is very low");
		System.out.println("very nice book");
	}
}
