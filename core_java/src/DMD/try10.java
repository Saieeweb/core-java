package DMD;

public class try10 {

	public static void main(String[] args) {
String s = "Saiee";
try {
System.out.println(s.charAt(10));
}catch(StringIndexOutOfBoundsException ex) {
	System.out.println("good morning");
}
System.out.println("hello saiee");

	}

}
