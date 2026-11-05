package OOPS;

public class overriding4 {

	public static void main(String[] args) {
		Employee e= new Devloper();
		e.first();

	}

}
class Employee
{
	public void first() {
		System.out.println("salary in the end of month");
	}
}
class Devloper extends  Employee
{
	public void first() {
		System.out.println("salary is not enough for mi");
	}
}
