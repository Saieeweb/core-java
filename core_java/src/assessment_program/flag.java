package assessment_program;

public class flag {

	public static void main(String[] args) {
int number = 98;
boolean flag = false;
for (int i=2; i<97; i++)

	{
	if (number%i==0)
	{
		flag=true;
	}
		
	}

if (!flag)
{
	System.out.println("prime");
}
else
{
	System.out.println("composite");
}
}
}
