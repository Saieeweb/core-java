package pratice;

public class FlagNumPrime1 {

	public static void main(String[] args) {
int num=2;
int counter=0;
int sum=0;
while(counter<20)
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
		counter++;
	}
	num++;
}
System.out.println("sum=" +sum);
	}

}
