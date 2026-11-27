package DMD;

public class try6 {

	public static void main(String[] args) {
int a = 20;
int b = 0;
try {
int c = a/b;
System.out.println("Division:"+c);
}catch (ArithmeticException ex) {
	System.out.println("not divided by zero");
}
System.out.println("program done");
	}

}
