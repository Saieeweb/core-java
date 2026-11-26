package DMD;

public class try1 {

	public static void main(String[] args) {
System.out.println("Saiee");
System.out.println("Good night");

try {
	System.out.println(10/0);

}catch(ArithmeticException ex)
{
	System.out.println("handled");
}


System.out.println("****");
	}

}
