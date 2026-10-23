package OOPS;

public class capulation4 {

	public static void main(String[] args) {

		salary first = new salary();
		first.setsal(60000);
		System.out.println("salary:"+first.getsalary());
	}

}

class salary{
	private double salary=50000;
	public void setsal (int S) {
		if (S>0) {
			System.out.println(" salary is not vaild ");
		}else {
			System.out.println("good salary");
		}
		
	}
	public double getsalary() {
		return salary;
	}
	
}