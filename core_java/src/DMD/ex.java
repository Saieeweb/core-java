package DMD;

public class ex {

	public static void main(String[] args) {
 int age=17;
 try {
 if (age <18)
 {
	 throw new Exception ("****");
 }
 }
 catch (Exception ex)
 {
	 ex.printStackTrace();
 }
System.out.println("GOOD MORNING"); 
 }

}
