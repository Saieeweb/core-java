package OOPS;

public class overloading6 {

	public static void main(String[] args) {
		Subject s = new Subject();
		s.marks(90);
		s.marks("science");

	}

}
class Subject
{
	public void marks(int i) {
		System.out.println(i);
	}
	public void marks(String p) {
		System.out.println(p);
	}
}