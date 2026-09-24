package program_array;

public class array_7 {

	public static void main(String[] args) {
		int[] numbers = {10, 15, 22, 31, 40, 55};
		int sum=0;
		int counter=0;

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                counter++;
                sum=sum+numbers[i];
                
            }
        }
        System.out.println("Total even number="+ counter);
        System.out.println("Total even number sum="+sum);
        }
}


