package program_constructors;

public class setterinj1 {

	public static void main(String[] args) {
		Car1 first = new Car1();
		first.setmileage(43);
		System.out.println(first.mileage);
	}

}

class Car1
{

String name;
int mileage;
public void setmileage(int mil)
{
	if (mil<50)
	{
		this.mileage=mil;
	}
	else
	{
		this.mileage=0;
	}
}
public int getmileage()
{
	return this.mileage;
}
public void setname(String name)
{
	this.name=name;
}
}