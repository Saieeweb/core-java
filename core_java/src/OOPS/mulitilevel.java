package OOPS;

public class mulitilevel {

	public static void main(String[] args) {
		Son1 first = new Son1();
		first.grand();
		first.fath();
		first.son();
		}

}
class Grandfather{
	public void grand() {
		System.out.println("*");
	}
}
class Father1 extends Grandfather{
	public void fath() {
		System.out.println("-");
	}
}
class Son1 extends Father1{
	public void son() {
		System.out.println("&");
	}
}