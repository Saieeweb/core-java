package program_object;

public class object2 {

	public static void main(String[] args) {
School first= new School();

first.rollnumber=67;
first.subject="Math";
first.gender='M';
first.idnumber=142;

System.out.println(first.rollnumber);
System.out.println(first.idnumber);

     College second= new College();
  second.age=23;
  second.division='b';
  second.Name="Saiee";
  System.out.println(second.age);
  System.out.println(second.division);
  System.out.println(second.Name);

	}

}
class School
{
	int rollnumber;
	String subject;
	char gender;
	int idnumber;
}
class College
{
	int age;
	char division;
	String Name;

}