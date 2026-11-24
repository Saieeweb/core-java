package DMD;

public class interface1 {

	public static void main(String[] args) {
Student.display();
Student.show();
	}

}

interface Student{
	static void display() {
		System.out.println("welcome to java");
		
	}
	static void show() {
		System.out.println("static method in interface");
	}
}
class Demo implements Student{
	
}