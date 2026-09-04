package pratice;

public class Flage1 {

	public static void main(String[] args) {
int number=98;
boolean flag =false;
for(int i=1; i<=87; i++)
{
	if (number%i==0)
	{
		flag=true;
	}
}
if(!flag)
{
	System.out.println("PRIME");
}
else
{
	System.out.println("COMPOSITE");
}
	}

}
