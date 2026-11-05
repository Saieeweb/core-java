package OOPS;

public class overriding7 {

	public static void main(String[] args) {
Bank00 b=new SBI00();
b.get();
b=new HDFC();
b.get();
b=new ICICI();
b.get();
		

	}

}
class Bank00{
	public void get() {
		System.out.println("give mi loan");
	}
}
class SBI00 extends Bank00{
	public void get() {
		System.out.println("SBI is bank");
	}
}
class HDFC extends Bank00{
	public void get() {
		System.out.println("HDFC has more interest");
	}
}
class ICICI extends Bank00{
	public void get() {
		System.out.println("mony on the bank");
	}
}
