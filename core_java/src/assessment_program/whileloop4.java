package assessment_program;

public class whileloop4 {

	public static void main(String[] args) {
int num=1;
int sum=0;
int counter=1;
while (counter<=98)
{
	if(num%7==0)
	{
		System.out.println(num);
		counter++;
		sum=sum+num;
	}
	num++;
}
System.out.println("sum"+sum);
	}

}
