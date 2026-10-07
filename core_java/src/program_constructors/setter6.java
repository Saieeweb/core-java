package program_constructors;

public class setter6 {

	public static void main(String[] args) {

		Subject first= new Subject();
		first.setenglish(98);
		System.out.println(first.getenglish());
	}

}
class Subject
{
	String math;
	String science;
int english;
	int leacture;
	public void setenglish (int eng)
	{
		if(eng>45)		{
			this.english=eng;
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	public int getenglish()
	{
		return this.english;
	}
}