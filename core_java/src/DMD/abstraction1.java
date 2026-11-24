package DMD;

public class abstraction1 {

	public static void main(String[] args) {
college c = new college();
c.Marks();
c.student();

	}

}
abstract class School{
	abstract void Marks();
	public void student() {
		System.out.println("students marks are great");
	}
}
class college extends School{
	public void Marks() {
		System.out.println("nice college");
	}
}