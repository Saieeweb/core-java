package program_array;

public class array10_2d {

	public static void main(String[] args) {
int[] numbers = 
{88,90,45,89,43};
int largest=numbers[0];
int secondlargest= numbers[0];
for (int i=1; i<5; i++) {
	if (numbers[i]> largest) {
		secondlargest=largest;
		largest=numbers[i];
	}
	else if (numbers[i]> secondlargest && numbers[i]!=largest)
	{
		secondlargest=numbers[i];
		
	}
}
System.out.println("largest numbers=" + largest);
System.out.println("second largest numbers="+secondlargest);
	}

}
