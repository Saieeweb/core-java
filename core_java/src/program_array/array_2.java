package program_array;

public class array_2 {

	public static void main(String[] args) {
     
		int arr[]= {89,90,56,87,43,89,76,100,65,45};
		
		int heights=500;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<heights)
			{
				heights=arr[i];
			}
		}
		System.out.println(heights);
     
	}

}
