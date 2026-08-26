package pratice;

public class unary2 { 
	int x;
	

	public static void main(String[] args) {
		int x=8;
		System.out.println(++x + x-- + x++ + x--);
		                 //9+9+8+9
		System.out.println(x++ + --x + x-- + ++x);
		                  //8+8+8+8
		System.out.println(--x + x++ + x++ + x++);
		                  //7+7+8+9
		x=8;
		System.out.println(--x + x-- + ++x + --x);
		                 //7+7+7+6
		System.out.println(++x + x++ + --x + x++);
		                 //9+9+9+9


		
		// TODO Auto-generated method stub

	}

}
