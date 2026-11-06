package mock_practice;

public class encapulation2 {

	public static void main(String[] args) {
		Child66 c = new Child66();
		c.setName("Saiee");
		c.setAge(23);
		c.setRollno(43);
		
		System.out.println("Student Name:"+ c.getName());
		System.out.println("Student Age:"+ c.getAge());
		System.out.println("Student Rollno:"+ c.getRollno());

		
	}

}
class Child66{
private String name;
private int age;
private int rollNo;

public void  setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age=age;
}
public void setRollno(int rollNo) {
	this.rollNo=rollNo;
}
public String getName() {
	return name;
	
}
public int getAge() {
	return age;
}
public int getRollno() {
	return rollNo;
}
}