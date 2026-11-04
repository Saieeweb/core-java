package OOPS;

public class encapulation {

	public static void main(String[] args) {
		Student first = new Student();
		first.setmarks(76);
		System.out.println(first.getmarks());		
	}
}
class Student {
	private int marks;
	public void setmarks (int m) {
		if (m>=0 && m<=1000) {
			System.out.println("fail");

		}
		else {
			System.out.println("fail");
		}
	}
	public int getmarks() {
		return marks;
	}
}