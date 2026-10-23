package OOPS;

public class capulation5 {

	public static void main(String[] args) {
		 car_speed first = new car_speed();
		first.setspeed(230);
		System.out.println(first.getspeed());

	}

}
class car_speed{
	private int speed=300;
	public void setspeed (int S) {
		if (S>0 && S<200) {
			System.out.println("normal speed");
		}
		else if (S>201 && S<250) {
			System.out.println("average speed");
		}else {
			System.out.println("not normal speed");
			
		}
	}
	public int getspeed() {
		return speed;
	}
}
