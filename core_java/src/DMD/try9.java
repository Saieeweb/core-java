package DMD;

public class try9 {

	public static void main(String[] args) {
String s= "java";
try {
	System.out.println(s.charAt(10));
}

catch(StringIndexOutOfBoundsException ex)
{
	System.out.println("invalid string index");
}
System.out.println("program completed");

	
	
}

}
