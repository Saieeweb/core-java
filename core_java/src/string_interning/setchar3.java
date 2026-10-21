package string_interning;

public class setchar3 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("pune");
		StringBuilder s1 = new StringBuilder("mumbai");
		s1.setCharAt(3, '#');
		s.setCharAt(0, '*');
		System.out.println(s);
		System.out.println(s1);
}
}