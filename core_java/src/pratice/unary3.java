package pratice;

public class unary3 {
	int m;

	public static void main(String[] args) {
		int m=10;
				System.out.println(m++ + --m + --m + m++);
		                          //10+10+9+9=38
				System.out.println(++m + --m + ++m + m--);
				                  //11+10+11+11=43
				System.out.println(--m + m++ + m++ + --m);
				                 //9+9+10+10=38
				System.out.println(m-- + ++m + m++ + m--);
				                  //10+10+11+11
				
		// TODO Auto-generated method stub

	}

}
