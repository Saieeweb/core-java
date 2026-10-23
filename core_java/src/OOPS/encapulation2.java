package OOPS;

public class encapulation2 {

	public static void main(String[] args) {
		
		ATM first = new ATM();
		first.checkpin(455);
		first.checkpin(2347);
	}
	
	}

class ATM{
	private int pin = 2347;
	public void checkpin(int p) {
		if (pin==p) {
			System.out.println("correct pin");
		}else {
			System.out.println("incorrect pin");
		}
	}

}
