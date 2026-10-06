package program_constructors;

public class cons6 {

	public static void main(String[] args) {
		marks first = new marks();
				first.get();

	}

}

class marks
{
	String name;
	int marks;
	String topper;
	String monitor;
	int rollnum;
	
	marks()
	{
		name = "saiee";
		marks = 89;
		topper = "tanvi";
		monitor = "nandini";
		rollnum = 34;
	}
	void get()
	{
	System.out.println("student name:"+name);
	
	System.out.println("maths marks:"+marks);

	System.out.println("topper name:"+topper);

	System.out.println("class monitor:"+monitor);
	System.out.println("saiee rollnumber:"+rollnum);
	}

}