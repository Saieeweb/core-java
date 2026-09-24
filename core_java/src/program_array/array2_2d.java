package program_array;

public class array2_2d {

	public static void main(String[] args) {
		int[][]numbers= {
				{187,765,908},
				{879,765,345},
				{123,543,768}
		};
		int sum=0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (numbers[i][j]%2==0) {
					System.out.println(numbers[i][j]);
					sum=sum+numbers[i][j];
					
				}
				
				//System.out.println("sum is: " + sum);
			}
		}
		System.out.println("sum is: " + sum);

	}

}
