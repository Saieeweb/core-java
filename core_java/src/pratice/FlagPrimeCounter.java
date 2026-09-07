package pratice;

public class FlagPrimeCounter {

	public static void main(String[] args) {
int num=2;
int counter=0;
while (num<=500)
{
	boolean flag= true;
	for(int i=2;i<num; i++)
	{
		if (num%i==0)
		{
			flag=false;
			break;
		}
		
	}
	if  (flag)
	{
		System.out.println(num);
		counter++;
	}
	num++;
}
System.out.println("number of prime=" + counter);
	}

}
