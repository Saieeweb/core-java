package DMD;

public class try2 {

	public static void main(String[] args) {
System.out.println("hello");
System.out.println("hello saiee");
System.out.println("hello saiee who are you");

try {
System.out.println(10/0);
}catch(ArithmeticException e) {
	
	e.printStackTrace();
}

System.out.println("hello everyone");
	}

}
