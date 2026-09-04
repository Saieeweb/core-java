package pratice;

public class DoWhile4 {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		int counter=1;
		do
		{
			if (num%3==0)
			{
				System.out.println(num);
				counter++;
				sum=sum+num;
			}
			num++;
			} while (counter<=100);
		System.out.println("sum"+sum);
		}
	}
