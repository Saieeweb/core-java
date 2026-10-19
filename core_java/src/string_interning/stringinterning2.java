package string_interning;

public class stringinterning2 {

	public static void main(String[] args) {
String s1 = "hello";
String s2 = "Hello";
String s3 = new String("hello").intern();
System.out.println(s1 == s2);
System.out.println(s2 == s3);
	}

}
