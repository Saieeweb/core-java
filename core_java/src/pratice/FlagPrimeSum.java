package pratice;

public class FlagPrimeSum {

	public static void main(String[] args) {
int num=2;
int sum=0;
while (num<=500)
{
	boolean flag=true;
	for (int i=2; i<num; i++)
	{
		if (num%i==0)
		{
			flag=false;
			break;
		}
	}
	if (flag)
	{
		System.out.println(num);
		sum=sum+num;
	}
	num++;
	
}
System.out.println("sum =" +sum);
	}

}
