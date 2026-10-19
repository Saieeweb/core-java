package string_interning;

public class string1 {

	public static void main(String[] args) {
    	String s = new String("mumbai");
		String s2="mumbai";
		String s3="pune";
		System.out.println(s==s2);
		System.out.println(s==s2);
		System.out.println(s.intern()==s2);
		}

}
