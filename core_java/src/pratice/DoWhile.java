package pratice;

public class DoWhile {

	public static void main(String[] args) {
		int salary=90000;
		do
		{
			int tax=(salary*20)/100;
			System.out.println(salary-tax);
			salary++;
		}
		while(salary<500000);

	}

}
