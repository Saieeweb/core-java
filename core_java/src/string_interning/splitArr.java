package string_interning;

public class splitArr {

	public static void main(String[] args) {
String s = "i am in pune";
String[] arr=s.split(" ");

for (int i=0; i<arr.length; i++)
{
	StringBuilder sb=new StringBuilder(arr[i]);
	System.out.print(sb.reverse()+ " ");
}
	}

}
