package Array;

public class Array2 {

	public static void main(String[] args) {
int []arr= {1,3,67,87,66,98,90};
int highest=2147483647;

for(int i=0; i<arr.length;i++)
{
	if (arr[i]<highest)
	{
		highest=arr[i];
	}
}
System.out.println(highest);

	}

}
