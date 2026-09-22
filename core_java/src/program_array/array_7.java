package program_array;

public class array_7 {

	public static void main(String[] args) {
		int[] numbers = {10, 15, 22, 31, 40, 55};

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}


