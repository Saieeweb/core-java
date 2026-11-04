package OOPS;

public class overloading7 {

	public static void main(String[] args) {
		Demo b = new Demo();
		b.multiply("saiee", "pooja");
		b.multiply(45, 78);
	}
}
class Demo{
	public void multiply(int i, int j) {
		System.out.println(i%j);
	}
	public void multiply(String a, String b) {
		System.out.println(a+ " " +b);
	}
}
	
