package program_object;

public class object3 {

	public static void main(String[] args) {
Hospital first = new Hospital();

first.name="Golden care";
first.patient=43;
first.doctor=" dr.jay";

System.out.println(first.name);
System.out.println(first.patient);

System.out.println(first.doctor);


Bike second = new Bike();

second.model = "GT 650";
second.price = 300000;
second.color = "Sliver";

System.out.println(second.model);
System.out.println(second.price);

System.out.println(second.color);

Driver third = new Driver();

third.name = "veer";
third.numberplate = 6789;
third.gender = 'M';

System.out.println(third.name);
System.out.println(third.numberplate);

System.out.println(third.gender);
	}
}



class Hospital
{
	String name;
	int patient;
	String doctor;
}
class Bike
{
	String model;
	double price;
	String color;
}

	class Driver
	{
		String name;
		int numberplate;
		char gender;
	}
	


