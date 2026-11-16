package OOPS;

public class single2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.get();
		c.dis();

	}

}
class Parent{
	public void get() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	public void dis()
	{
		System.out.println("Child");
	}
	
}