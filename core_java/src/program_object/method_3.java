package program_object;

public class method_3 {

	public static void main(String[] args) {
Calculater first = new Calculater();
first.add(45,87);
first.add(67,90);
first.sub(89, 90, 56);

	}
}
		
		
		
		class Calculater
		{
			public void add (int one,int two)
			{
				
				System.out.println(one+two);
			}
			public void sub (int one,int two,int three)
			{
				System.out.println(one-two-three);
			}
		}
	


