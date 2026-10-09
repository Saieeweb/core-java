package assessment_program;

public class array {

	public static void main(String[] args) {
int arr[]= {10,20,30,40,50};
int traget=60;
for (int i=0; i<arr.length;i++)
{
	for (int j=i; j<arr.length; j++)
	
		if (arr[i]+arr[j]==traget)

{
	System.out.println("sum:"+arr[i]);
	System.out.println("sum:"+arr[j]);
	}
}
		
	}
}


