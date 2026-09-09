package pratice;

public class FlagPratice {

	public static void main(String[] args) {
int number=2;
int counter=0;
int sum=0;
while(counter<90);
{
	boolean flag=false;
	for (int i=2; i<=number; i++)
	{
		if (number%i==0)
		{
			flag=true;
			break;
		}
	}
	if(flag)
	{
		System.out.println("prime="+number);
		sum=sum+number;
		counter++;
	}
	number++;
		
}
System.out.println("numbers of prime=" +number);
System.out.println("addition of prime="+sum);
System.out.println("counter of prime="+counter);
}

}




