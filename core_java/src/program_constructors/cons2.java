package program_constructors;

public class cons2 {

	public static void main(String[] args) {
		Student1 s1= new Student1();
		s1.display();

	}

}


class Student1
{
	String name;
	int age;
	String school;
	int fees;
	
	Student1()
	{
		name= "saiee";
		age = 23;
		school = "ellora";
		fees= 35000;
		
	}
		
	
	void display()
	
	{
		System.out.println("name="+ name);
		System.out.println("age=" +age);
		System.out.println("school="+school);
		System.out.println("fees="+fees);
	}
}
