package OOPS;

public class polymophric {

	public static void main(String[] args) {
		Parent12 P = new Child23();
		P.red();
		P.green();
		P.blue();
		P.black();

	}

}
class Parent12 {
	public void red() {
		System.out.println("red");
	}
	public void green() {
		System.out.println("green");
	}
	public void blue() {
		System.out.println("blue");
	}
	public void black() {
		System.out.println("black");
	}
}
class Child23 extends Parent12
{
	public void yellow()
	{
		System.out.println("yellow method");
	}
	public void blue() {
		System.out.println("blue method"); 
	}
	public void black() {
		System.out.println("black method");
	}
}