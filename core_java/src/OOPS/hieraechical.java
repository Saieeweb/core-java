package OOPS;

public class hieraechical {

	public static void main(String[] args) {
		prince1 first = new prince1();
		first.king();
		first.prince1();
		
		Prince2 second = new Prince2();
		second.king();
		second.Prince2();

	}

}
class King
{
	public void king() {
		System.out.println("**");
		
	}
}
class prince1 extends King
{
	public void prince1() {
		System.out.println("-");
	}
}
class Prince2 extends King
{
	public void Prince2() {
		System.out.println("&");
	}
}