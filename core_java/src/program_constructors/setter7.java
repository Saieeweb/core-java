package program_constructors;

public class setter7 {

	public static void main(String[] args) {
		age first = new age();
		first.setmarks(70);
		System.out.println(first.getmarks());

	}

}

class age
{
	int age;
	String name;
	int marks;
	
	public void setmarks (int marks)
	{
		if (marks>35)
		{
			this.marks=marks;
			System.out.println("fail");
		}
		if (marks>75)
		{
			this.marks=marks;
			System.out.println("great");
		}
		else
		{
			System.out.println("pass");
		}
	}
	public int getmarks()
	{
		return this.marks;
	}
}