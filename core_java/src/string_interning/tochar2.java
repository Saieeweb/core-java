package string_interning;

public class tochar2 {

	public static void main(String[] args) {
String s = "interning";
String s2 = "welcome";
char[] first = s.toCharArray();
char[] second = s2.toCharArray();
for (int i=0; i<first.length; i++) {
	if (first[i]=='n' || first[i]=='e' || first[i]=='i') {
		System.out.print("*");
	}
	else 
	{
       System.out.print(first[i]);
     }
}
System.out.println();
for (int i=0; i<second.length; i++) {
	if (second[i]=='n' || second[i]=='e' || second[i]=='c') {
		System.out.print("*");
	}
	else 
	{
       System.out.print(second[i]);	
}
}
	}
	
	}


	
	

