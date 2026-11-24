package DMD;

public class abstraction2 {

	public static void main(String[] args) {
Dog12 d = new Dog12();
d.sound();
d.eat();
	}

}

abstract class Animal12{
	abstract public void sound();
	public void eat() {
		System.out.println("Animals are eating");
	}
}
class Dog12 extends Animal12{
	public void sound() {
		System.out.println("Dog barks");
	}
}