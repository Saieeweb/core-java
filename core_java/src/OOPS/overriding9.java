package OOPS;

public class overriding9 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s= new Square();
		System.out.println("Rectaangle Area:"+ r.CalculateArea());
		System.out.println("Square Area: "+ s.CalculateArea());
	}
}
class Shape{
int CalculateArea() {
	return 0;
}
}
class Rectangle extends Shape{
	int length= 10;
	int breadth=5;
	
	 int CalculateArea() {
		 return length*breadth;
	 }
	
}
class Square extends Shape{
	int side=5;
	int CalculateArea() {
		return side*side;
	}
}
