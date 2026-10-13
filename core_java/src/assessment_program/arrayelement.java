package assessment_program;

public class arrayelement {

	public static void main(String[] args) {
int [] arr = {29,45,32,67,45};
int search= 29;
boolean a=false;
for (int i=0;i<arr.length; i++)
{
	if (arr[i]==search)
	{
		System.out.println("found number"+i);
		a=true;
		break;
	}
}
if (!a)
{
	System.out.println("not found number");
}
	}

}
