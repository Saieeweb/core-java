package Array;

public class Array1 {

	public static void main(String[] args) {
//int arr[]=new int[100];
//for (int i=0;i<arr.length;i++)
//{
	//arr[i]=i;
//}
//for(int i=0;i<arr.length;i++)
//{
	//System.out.println(arr[i]);
//}
		int []arr= {10,90,30,40,58,78};
		int lowest=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				lowest=arr[i];
			}
		}
		System.out.println(lowest);
		
	}

}