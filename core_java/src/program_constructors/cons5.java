package program_constructors;

public class cons5 {

	public static void main(String[] args) {
		body first = new body();
		first.get();

	}

}
class body
{
	String name;
	int bones;
	int fingers;
	
	body()
	{
		name = "hand";
		bones = 206;
		fingers = 10;
		
		
	}
	void get()
	{
		System.out.println("name of body part:"+name);
		System.out.println("numbers of bones:"+bones);
		System.out.println("count of finger:"+fingers);
	}
	
	
}