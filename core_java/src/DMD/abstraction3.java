package DMD;

public class abstraction3 {

	public static void main(String[] args) {
film f = new film();
f.act();
f.set();
	}

}
abstract class movie{
	abstract void act();
	public void set() {
		System.out.println("start shooting");
	}
}
class film extends movie{
	public void act() {
		System.out.println("end shooting");
	}
}
