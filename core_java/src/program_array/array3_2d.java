package program_array;

public class array3_2d {

	public static void main(String[] args) {
int [][] numbers= {
		{45,76,90},
		{87,67,54},
		{43,77,99}
};
		int counter=1;

for (int i=0; i<3; i++)
{
	for (int j=0; j<3; j++)
	{
		if (numbers[i][j]%2==0) {
			System.out.println(numbers[i][j]);
			counter++;
		}
	}
}
System.out.println("number of counter="+counter);
	}

}
