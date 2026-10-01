package program_object;

public class static2 {

	public static void main(String[] args) {
Earth1 india=new Earth1();
india.river= "ganga";
india.rain();

Earth1 brazil = new Earth1();
brazil.river = "amazon";
brazil.rain();


System.out.println("india river:" + india.river);
System.out.println("india river:" + india.river);



	}

}
class Earth1
{
	String river; //instance
	public static void rain()
	{
		System.out.println("the rain is pouring");
	}
}
