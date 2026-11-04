package OOPS;

public class overloading4 {

	public static void main(String[] args) {
		Book B = new Book();
		B.math(56,89,76);

	}

}

class Book{
	public void math(int i, int j) {
		System.out.println("good marks in math");
	}
	public void math(int i, int j, int k) {
		System.out.println("***");
		
	}
	public void math(int i) {
		System.out.println("*******");
	}
}