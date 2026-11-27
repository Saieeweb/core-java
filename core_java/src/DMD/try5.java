package DMD;

public class try5 {

	public static void main(String[] args) {
int a = 34;
int b = 45;

try {
	int c=a*b;
	System.out.println("Multi:"+c);
}catch (ArithmeticException ex) {
	System.out.println("can multi");
}
	}

}
