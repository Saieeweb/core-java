package OOPS;

public class DMD2 {

	public static void main(String[] args) {
Ani23 first = new Lion();
first.zoo();
	}

}
class Ani23{
	public void zoo() {
		System.out.println("animals in the zoo");
	}
}
class Lion extends Ani23
{
	public void zoo() {
		System.out.println("Lion in the cage");
	}
}
