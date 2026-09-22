package program_array;

public class array_6 {

	public static void main(String[] args) {
		int[] number= {67, 78, 54, 34, 23, 07};
		int sum= 0;
		int counter= 0;
		for (int i=0; i<number.length; i++){
		if (number[i]%2==0) {
			System.out.println(number[i]);
			counter++;
			sum=sum+number[i];
		}
		}
		System.out.println("total prime number="+counter);
		System.out.println("total number of sum="+sum);
			}

		
	}


