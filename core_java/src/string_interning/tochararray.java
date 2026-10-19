package string_interning;

public class tochararray {

	public static void main(String[] args) {
String s= "mumbai";
char[] chars= s.toCharArray();
for (int i=0; i<chars.length; i++)
{
	if(chars[i]=='i'|| chars[i]=='u'|| chars[i]=='b')
	{
		System.out.print("*");
	}
	else	{
		System.out.print(chars[i]);
	}
}
	}

}
