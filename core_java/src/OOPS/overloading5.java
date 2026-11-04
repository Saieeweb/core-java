package OOPS;

public class overloading5 {

	public static void main(String[] args) {
		Marks11 m = new Marks11();
				m.first(45);
		m.first("science");

	}

}
class Marks11{
	public void first(int i) {
		System.out.println(i);
	}
	public void first(String a) {
		System.out.println(a);
	}
}
