package OOPS;

public class overriding1 {

	public static void main(String[] args) {

		        Dog11 d = new Dog11();

		        d.sound();
		
	}
	
	}
		
class Animal00 {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog11 extends Animal00 {

    
    public void sound() {
        System.out.println("Dog barks");
    }

   
    }

	
