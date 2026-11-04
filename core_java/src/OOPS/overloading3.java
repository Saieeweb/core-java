package OOPS;

public class overloading3 {

	public static void main(String[] args) {
		Boy.run();
		Girl.run();
	}
}
class Boy
{
	static void run() {
		System.out.println("boy is runing");
	}
}
class Girl extends Boy{
	static void run() {
		System.out.println("girl is runing");
	}
}