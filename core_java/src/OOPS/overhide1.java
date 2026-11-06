package OOPS;

public class overhide1 {

	public static void main(String[] args) {
		Ani a = new Ani();
		a.sound();
		Dog d = new Dog();
		d.sound();

	}

}
class Ani{
	public void sound(){
		System.out.println("ani makes a sound");
	}
}
class Dog extends Ani{
	public void sound() {
		System.out.println("Dog are cuti");
	}
}
