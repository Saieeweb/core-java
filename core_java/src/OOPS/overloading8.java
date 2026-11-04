package OOPS;

public class overloading8 {

	public static void main(String[] args) {
		Stud s = new Stud();
		s.display("saiee");
		s.display("saiee", 23);
		s.display("saiee", 23, 99);

	}

}
class Stud{
	public void display(String a) {
		System.out.println(a);
		}
	public void display(String a, int b) {
		System.out.println(a+ " " +b);
	}
	public void display(String a, int b, double c) {
System.out.println(a+" "+b +" "+c);	}
	}
