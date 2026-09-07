package pratice;

public class Flag2 {

	public static void main(String[] args) {
int i=1;
int sum=0;
int counter=1;
for (int i=1; i<=100; i++)
{
	boolean flag=true;

	for(int j=2; j<i; j++)
	{
		if (i%j==0) {
			
		flag=false;
		break;
	}
}
if (flag)
{
	System.out.println(i);
}
	


}
	}
}

