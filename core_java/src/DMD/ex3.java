package DMD;

public class ex3 {

	public static void main(String[] args) {
int age=90;
try {
if (age<76) {
	throw new RuntimeException("****");
}
	}
	catch(RuntimeException ex)
	{
		ex.printStackTrace();
	}
System.out.println("hello saiee");
}

}
