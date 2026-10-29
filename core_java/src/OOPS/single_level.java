package OOPS;

public class single_level {

	public static void main(String[] args) {
		
		        Dog d = new Dog();
		        d.eat();
		        d.bark();
		    
		
	}
}
		class Cat {
		    void eat() {
		        System.out.println("Eating");
		    }
		}

		class Dog extends Cat {
		    void bark() {
		        System.out.println("Barking");
		    }
		}

