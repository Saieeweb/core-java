package Array;

public class Array1 {

	public static void main(String[] args) {
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