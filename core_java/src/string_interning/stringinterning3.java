package string_interning;

public class stringinterning3 {

	public static void main(String[] args) {
String s1 = "saiee";
String s2 = "saiee";
String s3 = "saiee";
String s4 = "saiee";
String s5 = new String("saiee");
System.out.println(s1==s2);
System.out.println(s3==s4);
System.out.println(s4==s5);
}

}
