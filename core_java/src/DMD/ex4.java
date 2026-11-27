package DMD;

public class ex4 {

	public static void main(String[] args) {
int a= 10;
int b= 0;

try {
	int c= a/b;
	System.out.println("Dividion:"+c);
} catch (ArithmeticException ex) {
	System.out.println("not divided by zero");
}


	}

}
