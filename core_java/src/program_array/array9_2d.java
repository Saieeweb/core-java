package program_array;

public class array9_2d {

	public static void main(String[] args) {
		int[] numbers = {987, 1576, 220, 654, 324, 674};

        int counter = 0;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);

                counter++;
                sum = sum + numbers[i];
            }
        }

        System.out.println("Counter = " + counter);
        System.out.println("Sum = " + sum);
    }
}

