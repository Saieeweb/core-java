package mock_practice;

public class encapulation1 {

	public static void main(String[] args) {
		Student first = new Student();
		first.setage(17);
		System.out.println(first.getage());

	}

}
class Student{
	private int age;
	public void setage(int a) {
		if (a>=0 &&a<=24) {
			age=a;
		}
	}

public int getage() {
	return age;
}
}