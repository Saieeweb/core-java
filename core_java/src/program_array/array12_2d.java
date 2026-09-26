package program_array;

public class array12_2d {

	public static void main(String[] args) {
		int [][]numbers = {
				{76,98,54},
				{88,34,23},
				{43,22,13}
				};
				int largest= numbers[0][0];
				int secondlargest=numbers[0][0];
				 int counter=0;
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++) {
						counter++;
						if (numbers[i] [j]> largest) {
							secondlargest=largest;
							largest=numbers[i][j];
						}
						if (numbers[i][j]>secondlargest &&
								numbers[i][j]<largest) {
							secondlargest=numbers[i][j];
						}
						}
						}
				System.out.println("largest="+ largest);
				System.out.println("second largest="+ secondlargest);
				System.out.println ("counter="+counter);
					
				}
	}

