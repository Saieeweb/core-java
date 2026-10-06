package program_object;

public class global4 {

	public static void main(String[] args) {
		college first = new college();
		first.display();

	}

}
class college
{
	public void display()
	{
		int students=45;
		String topper="Saiee";
		int marks=89;
		String teacher="shinde sir";
		
		System.out.println("student in class:"+students);
		System.out.println("topper name:"+topper);
		System.out.println("marks of topper:"+marks);
		System.out.println("name of the teacher:"+teacher);
	}
}
