package OOPS;

public class DMD {

	public static void main(String[] args) {
Fruit1 first = new Mango();
first.test();
	}

}
class Fruit1{
	public void test() {
		System.out.println("sweet");
	}
}
class Mango extends Fruit1{
	public void test()
	{
		System.out.println("sweet mango");
	}
}
