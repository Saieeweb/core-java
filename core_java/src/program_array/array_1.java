package program_array;

public class array_1 {

	public static void main(String[] args) {

		int arr []= {10,20,30,50,80,90};
		int lowest=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				lowest=arr[i];
			}
		}
		
		System.out.println(lowest);
		
	
	}
}
